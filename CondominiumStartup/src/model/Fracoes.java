package model;

import java.io.Serializable;

public class Fracoes implements Serializable {
    private String nome;
    private String piso;
    private long permilagem;
    private Person pessoaProprietária;

    public Fracoes(String nome, String piso, long permilagem, Person pessoaProprietária) {
        this.nome = nome;
        this.piso = piso;
        this.permilagem = permilagem;
        this.pessoaProprietária = pessoaProprietária;
    }



    public String getNamePiso() {
        return nome;
    }

    public void setNamePiso(String nome) {
        this.nome = nome;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public long getPermilagem() {
        return permilagem;
    }

    public void setPermilagem(long permilagem) {
        this.permilagem = permilagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Person getPessoaProprietária() {
        return pessoaProprietária;
    }

    public void setPessoaProprietária(Person pessoaProprietária) {
        this.pessoaProprietária = pessoaProprietária;
    }
}


