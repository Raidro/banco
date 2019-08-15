package br.senac.rn.banco.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private Sexo sexo;
    private String fone;

    public Pessoa(String nome, String cpf, Sexo sexo, String fone) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.fone = fone;
    }

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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
