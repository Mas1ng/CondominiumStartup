package views;

import exception.EmployeeDuplicatedNumberException;
import exception.NonExistElement;
import model.*;

import java.util.ArrayList;

public class CondominioView {
    public static int menuCondominio() {
        System.out.println("Gerir Condominios");
        int op;
        do {
        System.out.println("1 - Criar Condominio");
        System.out.println("2 - Listar Condominios");
        System.out.println("\n0 - Voltar");
        op = (int) GeneralView.getNumber("--->");
    } while (op < 0 || op > 2);
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
    public static void printListCondominio(ArrayList<Condominio> condominios) {
        for (int i = 0; i < condominios.size(); i++) {
            printCondominio(condominios.get(i)); //da println de todos os condominios da forma como aparece no to.String()
        }
    }

    public static void printCondominio(Condominio condominio) {
        System.out.println(condominio.toString());
    }

    public static Company addCondominio(Company company, Condominio condominio) {
        try {
            CondominioList condominios = company.getCondominios();
            condominios.insert(condominio);
            company.setCondominios(condominios);
            return company;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return company;
    }
}
