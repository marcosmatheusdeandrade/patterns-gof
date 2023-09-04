package br.com.pattern.behavior.state.states;

import br.com.pattern.behavior.state.CompraOnline;

public class Cancelada implements CompraState {
    @Override
    public void efetuarPagamento(CompraOnline compraOnline) {
        System.out.println("Não é possível realizar novo pagamento, a compra foi cancelada e realizado estorno.");
    }

    @Override
    public void reclamacao(CompraOnline compraOnline) {
        System.out.println("Reclamação aberta, entraremos em contato para saber se o cancelamento foi realizado.");
        compraOnline.setState(new ReclamacaoAberta(this));
    }

    @Override
    public void cancelar(CompraOnline compraOnline) {
        System.out.println("Não é possível cancelar, a compra já foi cancelada e realizado estorno.");
        compraOnline.setState(new Cancelada());
    }

    @Override
    public void fecharReclamacao(CompraOnline compraOnline) {
        System.out.println("Não existe reclamação aberta para esta compra, o status atual é cancelada.");
    }
}
