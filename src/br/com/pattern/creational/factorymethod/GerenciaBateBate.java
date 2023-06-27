package br.com.pattern.creational.factorymethod;

import br.com.pattern.creational.factorymethod.brinquedo.Brinquedo;
import br.com.pattern.creational.factorymethod.brinquedo.CarrinhoBateBate;

public class GerenciaBateBate extends GerenciaBrinquedo {

    @Override
    protected Brinquedo preparaBrinquedo() {
        return new CarrinhoBateBate();
    }
}
