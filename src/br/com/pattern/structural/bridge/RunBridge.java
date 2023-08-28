package br.com.pattern.structural.bridge;

import br.com.pattern.structural.bridge.dao.ProductMongoDAO;
import br.com.pattern.structural.bridge.dao.ProductSqlServerDAO;
import br.com.pattern.structural.bridge.model.Product;
import br.com.pattern.structural.bridge.service.ProductEJBService;
import br.com.pattern.structural.bridge.service.ProductSpringService;

public class RunBridge {

    public static void main(String[] args) {

        //realizada ponte dinâmica entre services e daos
        new ProductEJBService(new ProductMongoDAO()).save(new Product("Carrinho controle remoto", 80.00));
        System.out.println("---------------------------------------------------------------------------------------------------");

        new ProductSpringService(new ProductSqlServerDAO()).save(new Product("Carrinho controle remoto", 80.00));
        System.out.println("---------------------------------------------------------------------------------------------------");

        new ProductEJBService(new ProductSqlServerDAO()).save(new Product("Boneco do Batman", 80.00));
    }
}
