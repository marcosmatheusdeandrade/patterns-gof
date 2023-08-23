package br.com.pattern.structural.bridge;

import br.com.pattern.structural.bridge.dao.ProductMongoDAO;
import br.com.pattern.structural.bridge.dao.ProductSqlServerDAO;
import br.com.pattern.structural.bridge.model.Product;
import br.com.pattern.structural.bridge.service.ProductEJBService;

public class RunBridge {

    public static void main(String[] args) {

        //realizada ponte dinâmica entre services e daos
        new ProductEJBService(new ProductMongoDAO()).save(new Product("Carrinho controler remoto", 80.00));
        new ProductEJBService(new ProductSqlServerDAO()).save(new Product("Carrinho controler remoto", 80.00));
    }
}
