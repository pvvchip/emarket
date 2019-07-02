package ru.pvvchip.emarket.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.WebApplicationContext;
import ru.pvvchip.emarket.persist.repo.ProductRepository;
import ru.pvvchip.emarket.persist.repo.RoleRepository;
import ru.pvvchip.emarket.persist.repo.UserRepository;
import ru.pvvchip.emarket.service.impl.CartServiceImpl;
import ru.pvvchip.emarket.service.impl.ProductServiceImpl;
import ru.pvvchip.emarket.service.impl.UserServiceImpl;

@Configuration
public class ServiceConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(ServiceConfiguration.class);

    @Bean
    public UserService userService(UserRepository userRepository, RoleRepository roleRepository,
                                   BCryptPasswordEncoder passwordEncoder) {
        return new UserServiceImpl(userRepository, roleRepository, passwordEncoder);
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }

    @Bean
    @Scope(scopeName = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public CartService cartService() {
        return new CartServiceImpl();
    }
}
