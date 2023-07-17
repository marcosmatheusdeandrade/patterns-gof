package br.com.pattern.behavior.templatemethod;

import br.com.pattern.behavior.templatemethod.model.User;

public class UserPersist extends Persist<User> {

    @Override
    protected void preSave(User user) {
        System.out.println("Realizando validaçoes antes de persistir usuário.");
    }

    @Override
    protected void posSave(User model) {
        System.out.println("Enviando e-mail de confirmação após usuário salvo no banco de dados.");
    }
}
