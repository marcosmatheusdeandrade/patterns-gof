package br.com.pattern.behavior.state.states;

import br.com.pattern.behavior.state.CompraOnline;

public class ReclamacaoAberta implements CompraState {

    private CompraState stateAnterior;
    public ReclamacaoAberta(CompraState stateAnterior) {
        this.stateAnterior = stateAnterior;
    }

    @Override
    public void efetuarPagamento(CompraOnline compraOnline) {
        System.out.println("Não é possível realizar novo pagamento, existe reclamação aberta para esta compra.");
    }

    @Override
    public void reclamacao(CompraOnline compraOnline) {
        System.out.println("Já existe reclamação aberta para esta compra.");
    }

    @Override
    public void cancelar(CompraOnline compraOnline) {
        System.out.println("Não é possível cancelar, existe reclamação aberta para esta compra.");
    }

    @Override
    public void fecharReclamacao(CompraOnline compraOnline) {
        System.out.println("Reclamação encerrada.");
        compraOnline.setState(stateAnterior);
    }

}
