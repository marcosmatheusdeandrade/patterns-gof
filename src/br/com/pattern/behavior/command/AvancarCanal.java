package br.com.pattern.behavior.command;

public class AvancarCanal implements Command {
    @Override
    public void execute() {
        System.out.println("Indo para o próximo canal");
    }
}
