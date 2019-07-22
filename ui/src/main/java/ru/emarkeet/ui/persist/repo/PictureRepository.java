package ru.emarkeet.ui.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.emarkeet.ui.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
