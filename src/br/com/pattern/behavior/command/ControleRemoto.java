package br.com.pattern.behavior.command;

import br.com.pattern.behavior.command.commands.Command;

public class ControleRemoto {

    public void executarComando(Command command) {
        command.execute();
    }
}
