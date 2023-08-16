package br.com.pattern.creational.abstractfactory;

import br.com.pattern.creational.abstractfactory.model.Fita;
import br.com.pattern.creational.abstractfactory.model.JogoFisico;
import br.com.pattern.creational.abstractfactory.model.Nintendo;
import br.com.pattern.creational.abstractfactory.model.VideoGame;

import java.util.Arrays;
import java.util.List;

public class NintendoFactory implements VideoGameAbstractFacotry {

    @Override
    public VideoGame getVideoGame() {
        return new Nintendo();
    }

    @Override
    public List<JogoFisico> getJogos() {
        return Arrays.asList(new Fita("Super Mário"));
    }
}
