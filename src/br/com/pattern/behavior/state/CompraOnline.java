package br.com.pattern.behavior.state;

import br.com.pattern.behavior.state.states.CompraState;
import br.com.pattern.behavior.state.states.Nova;

public class CompraOnline {

    private CompraState compraState;

    public CompraOnline() {
        this.compraState = new Nova();
    }

    public void efetuarPagamento() {
        compraState.efetuarPagamento(this);
    }

    public void reclamacao() {
        compraState.reclamacao(this);
    }

    public void fecharReclamacao() {
        compraState.fecharReclamacao(this);
    }

    public void cancelar() {
        compraState.cancelar(this);
    }

    public void setState(CompraState compraState) {
        this.compraState = compraState;
    }
}
