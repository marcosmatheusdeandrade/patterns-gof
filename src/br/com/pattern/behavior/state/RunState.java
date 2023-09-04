package br.com.pattern.behavior.state;

public class RunState {

    public static void main(String[] args) {
        CompraOnline compraOnline = new CompraOnline();
        compraOnline.cancelar();
        compraOnline.reclamacao();
        compraOnline.efetuarPagamento();
        compraOnline.efetuarPagamento();
        compraOnline.reclamacao();
        compraOnline.cancelar();
        compraOnline.fecharReclamacao();
        compraOnline.cancelar();
    }
}
