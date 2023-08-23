package br.com.pattern.structural.bridge.dao;

import br.com.pattern.structural.bridge.model.Product;

public class ProductMongoDAO implements ProductDAO {
    @Override
    public void save(Product product) {
        System.out.println("Salvando produto "+product.description()+" no MongoDB");
    }

    @Override
    public void delete(Product product) {
        System.out.println("Excluindo produto "+product.description()+" no MongoDB");
    }

    @Override
    public String getType() {
        return "MongoDB";
    }
}
