package ru.pvvchip.emarket.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.pvvchip.emarket.persist.repo.ProductRepository;
import ru.pvvchip.emarket.persist.repo.RoleRepository;
import ru.pvvchip.emarket.persist.repo.UserRepository;
import ru.pvvchip.emarket.service.impl.ProductServiceImpl;
import ru.pvvchip.emarket.service.impl.UserServiceImpl;

@Configuration
public class ServiceConfiguration {

    @Bean
    public UserService userService(UserRepository userRepository, RoleRepository roleRepository,
                                   BCryptPasswordEncoder passwordEncoder) {
        return new UserServiceImpl(userRepository, roleRepository, passwordEncoder);
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}
