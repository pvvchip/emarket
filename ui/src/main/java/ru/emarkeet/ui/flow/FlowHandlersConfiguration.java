package ru.emarkeet.ui.flow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.emarkeet.ui.flow.register.UserRegisterHandler;
import ru.emarkeet.ui.service.UserService;

@Configuration
public class FlowHandlersConfiguration {

    @Bean
    public UserRegisterHandler userRegisterHandler(UserService userService) {
        return new UserRegisterHandler(userService);
    }
}
