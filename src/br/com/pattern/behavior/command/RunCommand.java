package br.com.pattern.behavior.command;

public class RunCommand {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.executarComando(new AbaixarVolume());
        controleRemoto.executarComando(new AvancarCanal());
        controleRemoto.executarComando(new VoltarCanal());
        controleRemoto.executarComando(new AumentarVolume());
    }
}
