package br.com.pattern.behavior.templatemethod;

import br.com.pattern.behavior.templatemethod.model.User;

public class RunTemplateMethod {

    public static void main(String[] args) {
        new UserPersist().save(new User("Marcos", "123"));
    }
}
