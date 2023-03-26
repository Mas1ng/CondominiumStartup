package model;

import exception.CondominioduplicatedNameException;
import exception.EmployeeDuplicatedNumberException;
import exception.NonExistElement;

import java.io.Serializable;
import java.util.ArrayList;

public class CondominioList implements Serializable {
    private ArrayList<Condominio> condominios;
    public CondominioList() { condominios = new ArrayList<>();}

    private Condominio getCondominioByName(String name){
        for (int i = 0; i < condominios.size(); i++) {
            Condominio p = condominios.get(i);
            if (p.getNome() == name) {
                return p;
            }
        }
        return null;
    }
    public boolean insert(Condominio condominio){
        Condominio p = getCondominioByName(condominio.getNome());
        if (p== null) {
            return condominios.add(condominio);
        }else{
            throw new CondominioduplicatedNameException(condominio.getNome()+"");
        }
    }
    public boolean remove(String nome){
        Condominio p = getCondominioByName(nome);
        if (p != null) {
            return condominios.remove(p);
        }else{
            throw new NonExistElement(nome+"");
        }
    }
    public void change(String name, Condominio condominio){
        Condominio p = getCondominioByName(name);
        if (p != null) {
            p.setNome(condominio.getNome());
            p.setHoraAbertura(condominio.getHoraAbertura());
            p.setHoraFecho(condominio.getHoraFecho());
            p.setMorada(condominio.getMorada());
            p.setFuncionarioGestor(condominio.getFuncionarioGestor());

        }else{
            throw new NonExistElement(name+"");
        }
    }
    public Condominio get(String name) {
        Condominio p = getCondominioByName(name);
        if (p != null) {
            return p;
        }else{
            throw new NonExistElement(name +"");
        }
    }

    public ArrayList<Condominio> getAll() {
        return (ArrayList<Condominio>) condominios.clone();//o que é que isto faz?
    }

}