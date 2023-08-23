package br.com.pattern.structural.bridge.dao;

import br.com.pattern.structural.bridge.model.Product;

public interface ProductDAO {
    void save(Product product);
    void delete(Product product);

    String getType();
}
