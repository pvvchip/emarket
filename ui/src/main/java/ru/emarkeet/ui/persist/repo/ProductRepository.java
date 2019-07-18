package ru.emarkeet.ui.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.emarkeet.ui.persist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
