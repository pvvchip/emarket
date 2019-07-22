package ru.emarket.chatboot.service;

public interface ChatBotService {

    String getBotName();

    String askBot(String request);
}
