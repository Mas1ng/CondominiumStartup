package model;

import exception.DataInvalidaException;

import java.io.Serializable;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Valencia implements Serializable{
    private String nomeValencia;
    private float custo;
    public String getNomeValencia() {
        return nomeValencia;
    }

    public void setNomeValencia(String name) {

        this.nomeValencia = name;
    }

    public float getCustoValencia() {

        return custo;
    }

    public void setCustoValencia(float custo) {
        this.custo = custo;
    }

}


