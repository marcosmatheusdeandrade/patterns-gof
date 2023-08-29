package br.com.pattern.behavior.command;

import br.com.pattern.behavior.command.commands.AbaixarVolume;
import br.com.pattern.behavior.command.commands.AumentarVolume;
import br.com.pattern.behavior.command.commands.AvancarCanal;
import br.com.pattern.behavior.command.commands.VoltarCanal;

public class RunCommand {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.executarComando(new AbaixarVolume());
        controleRemoto.executarComando(new AvancarCanal());
        controleRemoto.executarComando(new VoltarCanal());
        controleRemoto.executarComando(new AumentarVolume());
    }
}
