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
    public Valencias(String valencia) {
        checkValencias(valencia);
    }
    public String getValencias() {
        return valencias;
    }

    public void setContact(int contact) {
        checkContact(contact);
    }

    private void checkValencias(String valencias) throws ValenciasInvalidException {//criar exceção
        if (eValidValencias(valencias) == true) {
            this.valencias = valencias;
        } else {
            throw new DataInvalidaException("Valência inválida.");
        }
    }

    private boolean eValidContact(int contact){
        Pattern p = Pattern.compile("^\\d{9}$");
        Matcher m = p.matcher(Integer.toString(contact));
        return (m.matches());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Contato=" + contact +
                '}';
    }
}


