package ru.emarkeet.ui.persist.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.emarkeet.ui.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
