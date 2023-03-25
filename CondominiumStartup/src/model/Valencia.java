package model;

import exception.DataInvalidaException;

import java.io.Serializable;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Valencia implements Serializable{
    private String nome;
    private float custo;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

}


