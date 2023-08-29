package br.com.pattern.behavior.command;

public class VoltarCanal implements Command {

    @Override
    public void execute() {
        System.out.println("Voltando canal");
    }
}
