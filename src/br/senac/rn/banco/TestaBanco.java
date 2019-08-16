package br.senac.rn.banco;

import br.senac.rn.banco.model.*;
import br.senac.rn.banco.repository.ContaRepository;

public class TestaBanco {



    public static void main(String[] args) {

        ContaRepository bancoDeDadosConta = new ContaRepository();

        Pessoa mateus = new Pessoa("Mateus Satiro", "0000000000-1", Sexo.MASCULINO,"9999-1111");
        Conta mateusConta = new ContaPoupanca();

        mateusConta.setAgencia("1111-1");
        mateusConta.setTitular(mateus);

        bancoDeDadosConta.cadastraConta(mateus);









}
