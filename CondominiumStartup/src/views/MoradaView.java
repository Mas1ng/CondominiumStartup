package views;

import exception.DataInvalidaException;
import exception.MoradaInvalidaException;
import model.Contact;
import model.Morada;

public class MoradaView {
    public static Morada getMorada() {
        boolean flag;
        Morada morada = null;
        do {
            try {
                flag = false;
                String s = GeneralView.getText("Morada");
                morada = new Morada(s);
            } catch (MoradaInvalidaException m) {
                flag = true;
                System.out.println("Atenção: "+ m.getMessage());
            }
        } while (flag);
        return morada;
    }
}
