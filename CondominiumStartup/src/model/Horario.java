package model;

import exception.HorarioInvalidoException;
import views.GeneralView;

import java.io.Serializable;

public class Horario implements Serializable {
    private int hora;
    private int minuto;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Horas: "+
                hora+
               ":"+
                minuto+
                " ";
    }

    private void checkHorario(int hora, int minuto) throws HorarioInvalidoException{
        if(eValidaHora(hora, minuto)) {
            this.hora = hora;
            this.minuto= minuto;
        } else {
            throw new HorarioInvalidoException("A hora "+hora+":"+minuto+" é invalida");
        }
    }

    private boolean eValidaHora(int hora, int minuto) {
        if(hora>=0  && hora <=24) {
            if(minuto>=0  && hora <=60) {
                return true;
            } else return false;
        } else return false;   //fazes duas vezes else return false porquê?
    }

    public Horario criarHorario() {
        int hora= GeneralView.getNumberInt("Escreva a hora de abertura: ");
        int minuto=GeneralView.getNumberInt("Escreva o minuto de abertura: ");
        Horario horario = new Horario(hora, minuto);//o que faz isto?
        return horario;
    }
    /*public Horario getHorario(Horario a, Horario b) {

    }*/
}
