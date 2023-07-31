package br.com.pattern.behavior.observer;

import java.math.BigDecimal;

public class RunObserver {

    public static void main(String[] args) {
        Roupa nike = new Roupa("Nike", "G", BigDecimal.TEN);
        Roupa adidas = new Roupa("Nike", "G", BigDecimal.TEN);
        Roupa umbro = new Roupa("Nike", "G", BigDecimal.TEN);

        EmpresaDivulgacao radioFM = new EmpresaDivulgacao();
        radioFM.setNome("FM");
        radioFM.setMeioDivulgacao("Radio");

        EmpresaDivulgacao band = new EmpresaDivulgacao();
        band.setNome("Band");
        band.setMeioDivulgacao("Televisão");

        ClienteLoja clienteNike = new ClienteLoja();
        clienteNike.setNome("João");

        PromocaoRoupas promocaoNikeAdidas = new PromocaoRoupas();
        promocaoNikeAdidas.setDescricao("Liquidação Nike e Adidas 40% Off");
        promocaoNikeAdidas.addRoupa(nike);
        promocaoNikeAdidas.addRoupa(adidas);

        promocaoNikeAdidas.addInteressado(clienteNike);
        promocaoNikeAdidas.addInteressado(band);
        promocaoNikeAdidas.addInteressado(radioFM);
        promocaoNikeAdidas.notificaInteressados();


        PromocaoRoupas promocaoUmbro = new PromocaoRoupas();
        promocaoUmbro.setDescricao("Liquidação Umbro 25% Off");
        promocaoUmbro.addRoupa(umbro);

        promocaoUmbro.addInteressado(band);
        promocaoUmbro.addInteressado(radioFM);
        promocaoUmbro.notificaInteressados();
    }
}
