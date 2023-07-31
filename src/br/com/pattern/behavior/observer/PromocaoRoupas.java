package br.com.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class PromocaoRoupas {

    private String descricao;
    private List<Roupa> roupas = new ArrayList<>();
    private List<Observer> interessados = new ArrayList<>();

    public void notificaInteressados() {
        interessados.forEach(interessado -> interessado.notify(this));
    }

    public void addInteressado(Observer interessado) {
        this.interessados.add(interessado);
    }

    public void addRoupa(Roupa roupa) {
        this.roupas.add(roupa);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Roupa> getRoupas() {
        return roupas;
    }

    public void setRoupas(List<Roupa> roupas) {
        this.roupas = roupas;
    }
}
