package br.com.pattern.behavior.command.commands;

public class VoltarCanal implements Command {

    @Override
    public void execute() {
        System.out.println("Voltando canal");
    }
}
