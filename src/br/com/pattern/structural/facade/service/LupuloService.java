package br.com.pattern.structural.facade.service;

import br.com.pattern.structural.facade.model.Lupulo;

class LupuloService {

    Lupulo getLupulo(Double quantidade) {
        return new Lupulo(quantidade);
    }
}
