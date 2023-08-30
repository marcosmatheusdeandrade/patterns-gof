package br.com.pattern.structural.facade.service;

import br.com.pattern.structural.facade.model.Malte;

class MalteService {

    Malte getMalte(Double quantidade) {
        return new Malte(quantidade);
    }
}
