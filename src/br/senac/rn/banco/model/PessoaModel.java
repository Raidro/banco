package br.senac.rn.banco.model;

public class PessoaModel {

    private String nome;
    private String cpf;
    private SexoModel sexo;
    private String fone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public SexoModel getSexo() {
        return sexo;
    }

    public void setSexo(SexoModel sexo) {
        this.sexo = sexo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
