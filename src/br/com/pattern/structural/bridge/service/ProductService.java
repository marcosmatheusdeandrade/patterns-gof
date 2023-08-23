package br.com.pattern.structural.bridge.service;

import br.com.pattern.structural.bridge.model.Product;
import br.com.pattern.structural.bridge.dao.ProductDAO;

public abstract class ProductService {

    protected final ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void save(Product product) {
        productDAO.save(product);
    }

    void delete(Product product){
        productDAO.delete(product);
    }
}
