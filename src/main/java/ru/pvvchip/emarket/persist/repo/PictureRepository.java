package ru.pvvchip.emarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pvvchip.emarket.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
