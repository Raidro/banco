package br.senac.rn.banco.model;



public abstract class ContaModel {

    private static Integer id = 0;

    protected String agencia;
    protected String numero;
    protected Double saldo = 0.0;
    protected PessoaModel titular;

    public ContaModel() {

        id++;//id = id + 1;
        numero = id.toString();

    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public PessoaModel getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /*public void setNumero(String numero) {
        this.numero = numero;
    }*/

    public void setTitular(PessoaModel titular) {
        this.titular = titular;
    }

    public Boolean deposita(Double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;

        }
        return false;
    }

    public abstract Boolean saca(Double valor);

    public Boolean transfere(ContaModel contaDestino, Double valor) {
        if (saca(valor)) { // o saca ele faz o saque e devolve
            //saca(valor);
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }


}
