package br.com.pattern.behavior.command;

public class AumentarVolume implements Command {
    @Override
    public void execute() {
        System.out.println("Aumentando volume");
    }
}
