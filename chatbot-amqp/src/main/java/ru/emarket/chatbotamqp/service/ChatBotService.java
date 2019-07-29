package ru.emarket.chatbotamqp.service;

public interface ChatBotService {

    String getBotName();

    String askBot(String request);
}
