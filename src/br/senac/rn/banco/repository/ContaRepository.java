package br.senac.rn.banco.repository;

import br.senac.rn.banco.model.Conta;
import br.senac.rn.banco.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {

    private static Long id = 0L;
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static List<Conta> contas = new ArrayList<>();


    public void cadastraConta(Pessoa pessoa, Conta conta) {

        pessoas.add(pessoa);
        contas.add(conta);

    }

//    buscarConta() {
//    }
//
//    editarConta() {
//    }
//
//    excluirConta() {
//    }


}
