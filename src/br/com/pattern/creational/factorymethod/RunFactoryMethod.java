package br.com.pattern.creational.factorymethod;

public class RunFactoryMethod {

    public static void main(String[] args) {

        new GerenciaRodaGigante().iniciaBrinquedo();
        new GerenciaBateBate().iniciaBrinquedo();
    }
}
