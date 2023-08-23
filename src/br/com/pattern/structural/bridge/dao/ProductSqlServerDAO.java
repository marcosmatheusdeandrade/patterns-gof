package br.com.pattern.structural.bridge.dao;

import br.com.pattern.structural.bridge.model.Product;

public class ProductSqlServerDAO implements ProductDAO {
    @Override
    public void save(Product product) {
        System.out.println("Salvando produto "+product.description()+" no SqlServer");
    }

    @Override
    public void delete(Product product) {
        System.out.println("Excluindo produto "+product.description()+" no SqlServer");
    }

    @Override
    public String getType() {
        return "SqlServer";
    }
}
