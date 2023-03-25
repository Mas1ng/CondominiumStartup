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
        System.out.println("2 - Listar Condominios");
        System.out.println("\n0 - Voltar");
        op = (int) GeneralView.getNumber("--->");
    } while (op < 0 || op > 1);
        return op;
    }

    public static Condominio createCondominio() {
        String nome = GeneralView.getText("Escreva o nome do Condominio");
        Morada morada = MoradaView.getMorada();
        Horario horaAbertura= HorarioView.getHorario("Horário de Abertura");
        Horario horaFecho= HorarioView.getHorario("Horário de Fecho");
        Condominio condominio = new Condominio(nome, horaAbertura, horaFecho, morada);
        return condominio;
    }

    /*public static Condominio listarCondominio() {

    }*/

    /*public static Condominio changeCondominio(Condominio c) {
    }*/
}
