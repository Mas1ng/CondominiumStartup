package model;

import java.io.Serializable;

public class Condominio implements Serializable {

    private String nome;
    private Horario horaAbertura;
    private Horario horaFecho;

    private Morada morada;
    private Employee funcionarioGestor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Horario getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(Horario horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public Horario getHoraFecho() {
        return horaFecho;
    }

    public void setHoraFecho(Horario horaFecho) {
        this.horaFecho = horaFecho;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public Employee getFuncionarioGestor() {
        return funcionarioGestor;
    }

    public void setFuncionarioGestor(Employee funcionarioGestor) {
        this.funcionarioGestor = funcionarioGestor;
    }

    public Condominio(String nome, Horario horaAbertura, Horario horaFecho, Morada morada) {
        this.nome = nome;
        this.horaAbertura = horaAbertura;
        this.horaFecho = horaFecho;
        this.morada = morada;
    }

}
