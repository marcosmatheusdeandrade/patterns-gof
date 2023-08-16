package br.com.pattern.creational.abstractfactory.model;

public class Cd implements JogoFisico {

    private String descricao;

    public Cd(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
