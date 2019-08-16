package br.senac.rn.banco;

import br.senac.rn.banco.model.Conta;
import br.senac.rn.banco.model.Pessoa;
import br.senac.rn.banco.model.Sexo;
import br.senac.rn.banco.repository.ContaRepository;

public class TestaBanco {

    ContaRepository bancoDeDadosConta = new ContaRepository();

    public static void main(String[] args) {


        Pessoa mateus = new Pessoa("Mateus Satiro", "0000000000-1", Sexo.MASCULINO,"9999-1111");
        Conta mateusConta = new Conta("1111-1","11-111-1",mateus) {

            @Override
            public Boolean saca(Double valor) {
                return null;
            }
        };
    }




}
