package ru.pvvchip.emarket.persist.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.pvvchip.emarket.persist.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByUserName(String userName);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
