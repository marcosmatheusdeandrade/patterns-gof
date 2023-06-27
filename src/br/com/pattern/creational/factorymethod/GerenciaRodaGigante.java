package br.com.pattern.creational.factorymethod;

import br.com.pattern.creational.factorymethod.brinquedo.Brinquedo;
import br.com.pattern.creational.factorymethod.brinquedo.RodaGigante;

public class GerenciaRodaGigante extends GerenciaBrinquedo {

    @Override
    protected Brinquedo preparaBrinquedo() {
        return new RodaGigante();
    }
}
