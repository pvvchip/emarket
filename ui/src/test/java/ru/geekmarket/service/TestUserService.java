package ru.geekmarket.service;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.geekmarket.controller.LoginController;
import ru.geekmarket.controller.repr.ProductRepr;
import ru.geekmarket.persist.model.User;
import ru.geekmarket.persist.repo.ProductRepository;
import ru.geekmarket.persist.repo.RoleRepository;
import ru.geekmarket.persist.repo.UserRepository;
import ru.geekmarket.service.repr.ProductInfo;
import ru.geekmarket.service.repr.SystemUser;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class TestUserService {

    private UserService userService;

    @Before
    public void init() {
        userService = new UserServiceJpaImpl();
    }

    @Test
    public void testAddUser() {
        User expectedUser = new User();
        expectedUser.setId(1L);
        expectedUser.setFirstName("User name");

        Map<SystemUser> allItems = userService.findByUserName(expectedUser.getFirstName());
        assertEquals(allItems.size(), 1);
        assertEquals(1, (long) allItems.);
        assertEquals(1, (long) cartService.getItemsQty());
        assertEquals(new BigDecimal(111), cartService.getSubTotal());
    }
}
