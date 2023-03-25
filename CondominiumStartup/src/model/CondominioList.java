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
    public void change(long number, Employee employee){
        Employee p = getEmployeeByNumber(number);
        if (p != null) {
            p.setNome(employee.getNome());
            p.setNascimento(employee.getNascimento());
            p.setNumberEmployee(employee.getNumberEmployee());
        }else{
            throw new NonExistElement(number+"");
        }
    }
    public Employee get(long number) {
        Employee p = getEmployeeByNumber(number);
        if (p != null) {
            return p;
        }else{
            throw new NonExistElement(number +"");
        }
    }
}