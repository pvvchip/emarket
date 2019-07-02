package ru.pvvchip.emarket.persist.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.pvvchip.emarket.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
