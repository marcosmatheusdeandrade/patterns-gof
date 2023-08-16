package br.com.pattern.creational.abstractfactory;

import br.com.pattern.creational.abstractfactory.model.Cd;
import br.com.pattern.creational.abstractfactory.model.JogoFisico;
import br.com.pattern.creational.abstractfactory.model.Ps5;

import java.util.Arrays;
import java.util.List;

public class Ps5Factory implements VideoGameAbstractFacotry {

    @Override
    public Ps5 getVideoGame() {
        return new Ps5();
    }

    @Override
    public List<JogoFisico> getJogos() {
        return Arrays.asList(new Cd("God of war"));
    }
}
