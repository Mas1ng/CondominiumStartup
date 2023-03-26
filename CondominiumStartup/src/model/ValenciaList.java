package model;

import exception.EmployeeDuplicatedNumberException;
import exception.NonExistElement;

import java.io.Serializable;
import java.util.ArrayList;

public class ValenciaList implements Serializable {
    private ArrayList<Valencia>valencias;

    public ValenciaList() {
        valencias = new ArrayList<>();
    }

    private Employee getOrcamentoValencia(long orcamento){
       orcamento=custo/fracoes;
    }
