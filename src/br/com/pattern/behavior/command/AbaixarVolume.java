package br.com.pattern.behavior.command;

public class AbaixarVolume implements Command {
    @Override
    public void execute() {
        System.out.println("Abaixando o volume");
    }
}
