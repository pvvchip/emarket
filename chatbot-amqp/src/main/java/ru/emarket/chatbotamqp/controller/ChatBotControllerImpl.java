package ru.emarket.chatbotamqp.controller;

import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.emarket.chatboot.service.ChatBotService;
import ru.emarket.chatbotamqp.repr.TextMessage;

@RestController
public class ChatBotControllerImpl implements ChatBotController {

    private final static Logger logger = LoggerFactory.getLogger(ChatBotControllerImpl.class);

    private final EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    private final ChatBotService chatBotService;

    @Autowired
    public ChatBotControllerImpl(@Lazy EurekaClient eurekaClient, @Lazy ChatBotService chatBotService) {
        this.eurekaClient = eurekaClient;
        this.chatBotService = chatBotService;
    }

    @Override
    public String healthCheck() {
        logger.info("Health check endpoint");
        return eurekaClient.getApplication(appName).getName();
    }

    @Override
    public ChatMessage askChatBot(ChatMessage request) {
        logger.info("New request to chat bot");
        return new ChatMessage(chatBotService.getBotName(), chatBotService.askBot(request.getMessage()));
    }

//    -------------------------------------------------------------

    @Value("${msg.exchange.name}")
    private String exchange;

    @Value("${msg.routing.key}")
    private String routingKey;

    private final AmqpTemplate rabbitTemplate;

    @Autowired
    public SendMessageController(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("send")
    public String sendMessage(@RequestParam("msg") String msg) {
        rabbitTemplate.convertAndSend(exchange, routingKey, new TextMessage(msg));
        return "Message " + msg + " sent to RabbitMQ";
    }



}
