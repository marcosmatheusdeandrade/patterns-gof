package br.com.pattern.behavior.command.commands;

public class AbaixarVolume implements Command {
    @Override
    public void execute() {
        System.out.println("Abaixando o volume");
    }
}
