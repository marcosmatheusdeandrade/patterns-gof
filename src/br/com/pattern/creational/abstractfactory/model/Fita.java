package br.com.pattern.creational.abstractfactory.model;

public class Fita implements JogoFisico {

    private String descricao;

    public Fita(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
