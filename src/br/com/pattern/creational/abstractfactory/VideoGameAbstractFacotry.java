package br.com.pattern.creational.abstractfactory;

import br.com.pattern.creational.abstractfactory.model.JogoFisico;
import br.com.pattern.creational.abstractfactory.model.VideoGame;

import java.util.List;

public interface VideoGameAbstractFacotry {

    VideoGame getVideoGame();
    List<JogoFisico> getJogos();
}
