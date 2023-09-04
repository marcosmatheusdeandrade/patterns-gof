package br.com.pattern.behavior.state.states;

import br.com.pattern.behavior.state.CompraOnline;

public class Nova implements CompraState {
    @Override
    public void efetuarPagamento(CompraOnline compraOnline) {
        System.out.println("Pagamento realizado com sucesso.");
        compraOnline.setState(new Paga());
    }

    @Override
    public void reclamacao(CompraOnline compraOnline) {
        System.out.println("Não é possível abrir reclamação, a compra ainda não foi realizada.");
    }

    @Override
    public void cancelar(CompraOnline compraOnline) {
        System.out.println("Não é possível realizar cancelamento, a compra ainda não foi realizada.");
    }

    @Override
    public void fecharReclamacao(CompraOnline compraOnline) {
        System.out.println("Não existe reclamação aberta para esta compra, o status atual é nova.");
    }
}
