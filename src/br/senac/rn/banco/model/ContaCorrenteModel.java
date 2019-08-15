package br.senac.rn.banco.model;

public class ContaCorrenteModel extends ContaModel {

    private final Double TAXA = 1.0; // está maiuscula ´pq é constante

    private Double limite = 0.0;

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public Double getTaxa() {
        return TAXA;
    }

    @Override
    public Boolean saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valorComTaxa <= saldoComLimite) {
            saldo -= valorComTaxa;
            return true;
        }
        System.out.println("SALDO INSUFICIENTE!");
        return false;

    }
}
