package br.com.pattern.creational.factorymethod;

import br.com.pattern.creational.factorymethod.brinquedo.Brinquedo;

public abstract class GerenciaBrinquedo {

    protected void iniciaBrinquedo() {
        preparaBrinquedo().brincar();
    }

    abstract protected Brinquedo preparaBrinquedo();
}
