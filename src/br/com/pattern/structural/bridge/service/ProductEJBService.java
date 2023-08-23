package br.com.pattern.structural.bridge.service;

import br.com.pattern.structural.bridge.dao.ProductDAO;
import br.com.pattern.structural.bridge.model.Product;

public class ProductEJBService extends ProductService {

    public ProductEJBService(ProductDAO productDAO) {
        super(productDAO);
    }

    @Override
    public void save(Product product) {
        System.out.println("Salvando "+product.description()+" utilizando service injetada via EJB e utilizando banco de dados "+productDAO.getType());
        super.save(product);
    }

    @Override
    void delete(Product product) {
        System.out.println("Excluindo "+product.description()+" utilizando service injetada via EJB e utilizando banco de dados "+productDAO.getType());
        super.delete(product);
    }
}
