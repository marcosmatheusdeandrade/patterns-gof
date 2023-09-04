package br.com.pattern.behavior.state.states;

import br.com.pattern.behavior.state.CompraOnline;

public interface CompraState {

    void efetuarPagamento(CompraOnline compraOnline);

    void reclamacao(CompraOnline compraOnline);

    void cancelar(CompraOnline compraOnline);

    void fecharReclamacao(CompraOnline compraOnline);

}
