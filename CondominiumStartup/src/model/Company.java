package model;

import java.io.Serializable;

public class Company implements Serializable {
    public String nome;
    public Contact contact;
    EmployeeList employees;

    //TODO: Fazer para condominios o que esta feito para empregados

    public Company(){
        this.employees = new EmployeeList();
    }
    public Company(String nome, Contact contact){
        this.nome = nome;
        this.contact = contact;
        this.employees = new EmployeeList();
    }
    public String getNome(){
        return nome;
    }
    public Contact getContact(){
        return contact;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setContact(Contact contact){
        this.contact = contact;
    }

    public EmployeeList getEmployeeList(){
        return this.employees;
    }
    public void setEmployeeList(EmployeeList employees){
        this.employees = employees;
    }
}
