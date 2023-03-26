package model;

import exception.EmployeeDuplicatedNumberException;
import exception.NonExistElement;
import exception.ValenciasDuplicatedNameException;

import java.io.Serializable;
import java.util.ArrayList;
public class ValenciaList implements Serializable {
    private ArrayList<Valencia> valencias;

    public ValenciaList() {
        valencias = new ArrayList<>();
    }
    private Valencia getValenciaByName(String name){
        for (int i = 0; i < valencias.size(); i++) {
            Valencia p = valencias.get(i);
            if (p.getNomeValencia().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public boolean insert(Valencia valencia) {
        Valencia p =getValenciaByName(valencia.getNomeValencia());
        if (p.getNomeValencia().equals(null)) {
            return valencias.add(valencia);
        } else {
            throw new ValenciasDuplicatedNameException(valencia.getNomeValencia() + "");//qual a razão das aspas?
        }
    }

    public Valencia remove(String nome) {
        Valencia p = getValenciaByName(nome);
        if (p != null) {
            valencias.remove(p);
            return p;
        } else {
            throw new NonExistElement(valencias+ "");
        }
    }


}



