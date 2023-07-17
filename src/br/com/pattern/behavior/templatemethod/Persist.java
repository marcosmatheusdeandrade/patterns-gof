package br.com.pattern.behavior.templatemethod;

import br.com.pattern.behavior.templatemethod.model.Model;

public abstract class Persist<M extends Model> {

    public final M save(M model) {
        preSave(model);
        System.out.println("Persistindo no banco de dados..");
        posSave(model);

        return model;
    }

    protected void preSave(M model) {}
    protected void posSave(M model) {}

}
