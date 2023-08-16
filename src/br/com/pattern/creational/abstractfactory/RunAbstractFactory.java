package br.com.pattern.creational.abstractfactory;

public class RunAbstractFactory {

    public static void main(String[] args) {
        showConsoleAndGames(new Ps5Factory());
        showConsoleAndGames(new NintendoFactory());
    }

    private static void showConsoleAndGames(VideoGameAbstractFacotry abstractFacotry) {
        System.out.println("Console "+ abstractFacotry.getVideoGame().getDescricao()+" com os seguintes jogos dísponiveis: ");
        abstractFacotry.getJogos().forEach(jogo -> System.out.println(jogo.getDescricao()));
    }
}
