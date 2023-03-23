package views;

import model.Condominio;
import model.Horario;
import model.Morada;

public class CondominioView {
    public static int menuCondominio() {
        System.out.println("Gerir Condominios");
        int op;
        do {
        System.out.println("\nMenu Condominio");
        System.out.println("1 - Alterar dados Condominio");
        System.out.println("\n0 - Voltar");
        op = (int) GeneralView.getNumber("--->");
    } while (op < 0 || op > 1);
        return op;
    }

    public static Condominio createCondominio() {
        String nome = GeneralView.getText("Escreva o nome do Condominio");
        Morada morada = MoradaView.getMorada();
        Horario horaAbertura = new Horario(int hora, int minuto);
    }
    public static Condominio changeCondominio(Condominio c) {

    }
}
