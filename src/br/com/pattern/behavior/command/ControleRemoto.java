package br.com.pattern.behavior.command;

public class ControleRemoto {

    public void executarComando(Command command) {
        command.execute();
    }
}
