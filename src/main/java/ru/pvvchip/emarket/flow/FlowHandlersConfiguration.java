package ru.pvvchip.emarket.flow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pvvchip.emarket.flow.register.UserRegisterHandler;
import ru.pvvchip.emarket.service.UserService;

@Configuration
public class FlowHandlersConfiguration {

    @Bean
    public UserRegisterHandler userRegisterHandler(UserService userService) {
        return new UserRegisterHandler(userService);
    }
}
