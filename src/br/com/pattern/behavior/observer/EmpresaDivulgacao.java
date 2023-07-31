package br.com.pattern.behavior.observer;

public class EmpresaDivulgacao implements Observer {

    private String nome;
    private String meioDivulgacao;

    @Override
    public void notify(PromocaoRoupas promocaoRoupas) {
        System.out.println("Olá somos da "+meioDivulgacao+" "+nome+" iremos divulgar em nossos canais a promoção "+promocaoRoupas.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMeioDivulgacao() {
        return meioDivulgacao;
    }

    public void setMeioDivulgacao(String meioDivulgacao) {
        this.meioDivulgacao = meioDivulgacao;
    }
}
