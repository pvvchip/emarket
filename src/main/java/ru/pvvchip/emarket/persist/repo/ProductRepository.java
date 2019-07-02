package ru.pvvchip.emarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pvvchip.emarket.persist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
