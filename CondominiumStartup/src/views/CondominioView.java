package views;

import model.Condominio;
import model.Employee;
import model.Horario;
import model.Morada;

public class CondominioView {
    public static int menuCondominio() {
        System.out.println("Gerir Condominios");
        int op;
        do {
        System.out.println("\nMenu Condominio");
        System.out.println("1 - Criar Condominio");
        System.out.println("\n0 - Voltar");
        op = (int) GeneralView.getNumber("--->");
    } while (op < 0 || op > 1);
        return op;
    }

    public static Condominio createCondominio() {
        String nome = GeneralView.getText("Escreva o nome do Condominio");
        Morada morada = MoradaView.getMorada();
        int horaa=GeneralView.getNumberInt("Escreva a hora de abertura: ");
        int minutoa=GeneralView.getNumberInt("Escreva o minuto de abertura: ");
        int horaf=GeneralView.getNumberInt("Escreva a hora de fecho: ");
        int minutof=GeneralView.getNumberInt("Escreva o minuto de fecho: ");
        Horario horaAbertura = new Horario(horaa, minutoa);
        Horario horaFecho = new Horario(horaf, minutof);
        Condominio condominio = new Condominio(nome, horaAbertura, horaFecho, morada);
        return condominio;
    }

    /*public static Condominio changeCondominio(Condominio c) {
    }*/
}
