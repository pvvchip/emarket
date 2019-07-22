package ru.emarkeet.ui.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.emarkeet.ui.persist.model.Category;
import ru.emarkeet.ui.service.model.CategoryRepr;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select new ru.geekmarket.controller.repr.CategoryRepr(c.id, c.name, count(p.id)) " +
            "from Category c " +
            "left join c.products p " +
            "group by c.id, c.name")
    List<CategoryRepr> getAllCategoryRepr();
}
