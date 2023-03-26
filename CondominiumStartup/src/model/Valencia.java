package model;

import exception.DataInvalidaException;

import java.io.Serializable;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Valencia implements Serializable{
    private String valencia;
    private float custo;
    public String getNome() {
        return valencia;
    }

    public void setNome(String name) {
        this.valencia = name;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

}


