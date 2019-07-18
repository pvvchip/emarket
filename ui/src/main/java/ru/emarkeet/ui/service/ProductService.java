package ru.emarkeet.ui.service;

import ru.emarkeet.ui.service.model.ProductRepr;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<ProductRepr> findAll();

    ProductRepr findById(Long id);

    void deleteById(Long id);

    void save(ProductRepr product) throws IOException;
}
