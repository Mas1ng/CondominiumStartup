package controllers;

import model.*;
import views.*;

import java.util.ArrayList;


public class Controller {
    private Company company;

    public Controller(Company company) {
        this.company = company;
    }

    public Company run() {
        int op = -1;
        do {
            op = GeneralView.generalMenu();
            switch (op) {
                case 1:
                    runCompany(company);
                    //CompanyView.mainCompany(model);
                    break;
                case 2:
                    runPeople(company);
                    //PersonView.mainPeople(model);
                    break;
                case 5:
                    runStatistics(company);
                    //StatisticsView.mainStatistics(model);
                    break;
                default:
                    GeneralView.writeText("Nice to have You! See you Soon!!");
                    break;
            }
        } while (op != 0);
        System.out.println(company.getNome());
        System.out.println(company.getContact());
        System.out.println(company.getCondominios());
        return company;

    }

    private void runCompany(Company company) {
        int op;
        do {
            op = CompanyView.menuCompany(company.nome);
            switch (op) {
                case 0:
                    GeneralView.writeText("Volta para o menu anterior.");
                    break;
                case 1:
                    Company b = CompanyView.changeCompany(company);
                    if (b != null) {
                        GeneralView.writeText("Alterado\n");
                    }
                    break;
                case 2:
                    //menu Condominio
                    runCondominio();
                    break;
                default:
                    GeneralView.writeText("Opção Errada");
                    break;
            }
        } while (op != 0);
    }

    private void runCondominio() {
        GeneralView.writeText("Menu Condominios\n");
        int num = CondominioView.menuCondominio();
        Condominio condominio = null;
        switch (num) {
            case 0:
                GeneralView.writeText("Volta para o menu anterior.");
                break;
            case 1:
                condominio = CondominioView.createCondominio();
                if (condominio != null) {
                    GeneralView.writeText("Criado\n");
                    company = CondominioView.addCondominio(company, condominio);
                }
                break;
            case 2:
                //Criar funcao no CondominioView para listar condominis e mandar model como argumento
                CondominioList condominios = company.getCondominios(); // o porquê de esta linha
                ArrayList<Condominio> list = condominios.getAll();//same
                CondominioView.printListCondominio(list);
                break;
            default:
                GeneralView.writeText("Opção Errada");
                break;
            }
    }

    private void runPeople(Company company) {
        GeneralView.writeText("Gerir Pessoas");
        int op;
        do {
            op = PersonView.menuPeople();
            switch (op) {
                case 0:
                    GeneralView.writeText("Volta para o menu anterior.");
                    break;
                case 1:
                    EmployeeView.mainEmployee(company);
                    break;
                default:
                    GeneralView.writeText("Opção Errada");
                    break;
            }
        } while (op != 0);
    }

    public static void runStatistics(Company company) {

        int op;
        do {
            op = StatisticsView.menuStatistic();
            switch (op) {
                case 0:
                    GeneralView.writeText("Volta para o menu anterior.");// o que faz isto?
                    break;
                case 1:
                    GeneralView.writeText("Os 5 funcionarios mais velhos");
                    ArrayList<Person> olderPeopleList = company.getEmployeeList().getNOldestPeople(5);
                    PersonView.printPeople(olderPeopleList);
                    break;
                case 2:
                    GeneralView.writeText("Procurar funcionario por nome");
                    String query = GeneralView.getText("Introduza parte do nome");
                    ArrayList<Person> foundPeopleList = company.getEmployeeList().searchByName(query);
                    PersonView.printPeople(foundPeopleList);
                    break;
                default:
                    GeneralView.writeText("Opção Errada");
                    break;
            }

        } while (op != 0);
    }
}
