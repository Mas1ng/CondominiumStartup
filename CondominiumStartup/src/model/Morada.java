package model;

import exception.MoradaInvalidaException;

import java.io.Serializable;

public class Morada implements Serializable {
    private String morada;

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Morada(String morada) {
        this.morada = morada;
    }

    public boolean eValidaMorada(String morada) {
        if(morada.length() >=10 && morada.length() <= 100){
            return true;
        }else return false;
    }

    private void checkMorada(String morada) throws MoradaInvalidaException {
        if(eValidaMorada(morada)) {
            this.morada = morada;
        } else {
            throw new MoradaInvalidaException("Morada Invalida");
        }
    }

    @Override
    public String toString() {
        return "Morada: "+
                morada;
    }
}
