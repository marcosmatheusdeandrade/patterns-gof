package br.com.pattern.behavior.observer;

public class ClienteLoja implements Observer {

    private String nome;
    private String telefone;

    @Override
    public void notify(PromocaoRoupas promocaoRoupas) {
        System.out.println("Olá, sou o cliente "+nome+" irei até a loja conferir a promoção "+promocaoRoupas.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
