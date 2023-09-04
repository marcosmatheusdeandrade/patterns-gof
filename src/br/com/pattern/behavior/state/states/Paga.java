package br.com.pattern.behavior.state.states;

import br.com.pattern.behavior.state.CompraOnline;

public class Paga implements CompraState {

    @Override
    public void efetuarPagamento(CompraOnline compraOnline) {
        System.out.println("Não é possível realizar novo pagamento, pois o pagamento já foi efetuado.");
    }

    @Override
    public void reclamacao(CompraOnline compraOnline) {
        System.out.println("Reclamação aberta, em instantes nossos atendentes entrarão em contato.");
        compraOnline.setState(new ReclamacaoAberta(this));
    }

    @Override
    public void cancelar(CompraOnline compraOnline) {
        System.out.println("Compra cancelada, iremos realizar o estorno do pagamento.");
        compraOnline.setState(new Cancelada());
    }

    @Override
    public void fecharReclamacao(CompraOnline compraOnline) {
        System.out.println("Não existe reclamação aberta para esta compra, o status atual é paga.");
    }
}
