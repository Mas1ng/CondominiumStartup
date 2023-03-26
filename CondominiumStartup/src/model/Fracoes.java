package model;

import java.io.Serializable;

public class Fracoes implements Serializable {
    private String nome;
    private String piso;
    private long permilagem;
    private String denominação;
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
    public String getDenominação(){return denominação;}

    public void setDenominação(String denominação) {
        this.denominação = denominação;
    }

    public String pessoaproprietaria(String nome, Data nascimento, String denominação) {
        super(nome,nascimento);
        setDenominação(denominação);
    }

}


