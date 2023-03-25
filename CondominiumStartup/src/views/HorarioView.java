package views;

import exception.DataInvalidaException;
import model.Horario;

public class HorarioView {

    public static Horario getHorario() {
        boolean flag;
        Horario horario = null;
        do {
            try {
                flag = false;
                System.out.println("Horario: ");

                int hora = (int) GeneralView.getNumber("Hora: ");
                int minuto = (int) GeneralView.getNumber("Minuto: ");

                horario = new Horario(hora, minuto);
            } catch (DataInvalidaException e) {
                flag = true;
                System.out.println("Atenção: "+ e.getMessage());
            }
        } while (flag);
        return horario;
    }
    }

