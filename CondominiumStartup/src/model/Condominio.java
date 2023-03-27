package model;

import java.io.Serializable;

public class Condominio implements Serializable {

    private String nome;
    private Horario horaAbertura;
    private Horario horaFecho;
    private Morada morada;
    private Employee funcionarioGestor;

    private long valorBase;

    private Fracoes fracoes;
    private Valencia valencias;



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

    public long getValorBase() {
        return valorBase;
    }

    public void setValorBase(long valorBase) {
        this.valorBase = valorBase;
    }

    public Condominio(String nome, Horario horaAbertura, Horario horaFecho, Morada morada/*String Valências*/, Valencia valencias) {
        this.nome = nome;
        this.horaAbertura = horaAbertura;
        this.horaFecho = horaFecho;
        this.morada = morada;
        this.valencias = valencias;
        this.valorBase = valorBase;
    }

   /* public Condominio(String nome, Horario horaAbertura, Horario horaFecho, Morada morada) {
        this.nome = nome;
        this.horaAbertura = horaAbertura;
        this.horaFecho = horaFecho;
        this.morada = morada;
    }*/

    @Override
    public String toString() {
        return "Condominio{" +
                "nome='" + nome + '\'' +
                ", hora de abertura=" + horaAbertura +
                ", Hora de fecho=" + horaFecho +
                ", morada=" + morada +
                ", funcionarioGestor=" + funcionarioGestor +
                ", valor base=" + valorBase +
                '}';
    }
}
