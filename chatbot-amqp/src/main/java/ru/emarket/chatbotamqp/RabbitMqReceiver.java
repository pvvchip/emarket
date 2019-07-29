package ru.emarket.chatbotamqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import ru.emarket.chatbotamqp.repr.TextMessage;

@RabbitListener(queues = "${msg.queue.name}")
public class RabbitMqReceiver {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMqReceiver.class);

    @RabbitHandler
    public void receive(TextMessage msg) {
        logger.info("New message {}", msg.getText());
    }
}
