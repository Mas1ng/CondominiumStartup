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
      //  Valencia valencia =
        private ArrayList<Employee> employees;

    public EmployeeList() {
            employees = new ArrayList<>();
        }

        private Employee getEmployeeByNumber(long number){
            for (int i = 0; i < employees.size(); i++) {
                Employee p = employees.get(i);
                if (p.getNumberEmployee() == number) {
                    return p;
                }
            }
            return null;
        }
        public boolean insert(Employee employee){
            Employee p = getEmployeeByNumber(employee.getNumberEmployee());
            if (p== null) {
                return employees.add(employee);
            }else{
                throw new EmployeeDuplicatedNumberException(employee.getNumberEmployee()+"");//qual a razão das aspas?
            }
        }
        public Employee remove(long number){
            Employee p = getEmployeeByNumber(number);
            if (p != null) {
                employees.remove(p);
                return p;
            }else{
                throw new NonExistElement(number+"");
            }
        }
        public void change(long number, Employee employee){
            Employee p = getEmployeeByNumber(number);
            if (p != null) {
                p.setNome(employee.getNome());
                p.setNascimento(employee.getNascimento());
                p.setNumberEmployee(employee.getNumberEmployee());
            }else{
                throw new NonExistElement(number+"");
            }
        }
        public Employee get(long number) {
            Employee p = getEmployeeByNumber(number);
            if (p != null) {
                return p;
            }else{
                throw new NonExistElement(number +"");
            }
        }
        public ArrayList<Employee> getAll() {
            return (ArrayList<Employee>) employees.clone();
        }

    /*public ArrayList<Employee> compareNameEmployee(ArrayList<Employee> employees) {
        for (int i=0;i<=employees.size();i++) {
            String temp = employees.get(i);
            if (temp.equals())
    }
}*/


        public ArrayList<Person> getNOldestPeople(int n) {
            boolean flag;
            ArrayList<Person> lista = new ArrayList<>();
            if (n <= 0) {
                return lista;
            }
            for(Person person: employees){
                flag = false;
                for (int i = 0; i < lista.size(); i++){
                    if (person.getNascimento().eAnterior(lista.get(i).getNascimento())) {
                        lista.add(i, person);
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    lista.add(person);
                }
            }

            for (int i = lista.size() - 1; i > n - 1; i--) {
                lista.remove(i);
            }

            return lista;
        }

        public ArrayList<Person> searchByName(String query) {
            ArrayList<Person> lista = new ArrayList<>();
            if (employees.size() < 1) {
                return lista;
            }

            for(Person person: employees){
                if(person.getNome().toLowerCase().contains(query.toLowerCase())){
                    lista.add(person);
                }
            }
            return lista;
        }
        Condominio condominio = new Condominio(nome, horaAbertura, horaFecho, morada);
        return condominio;
    }

    /*public static Condominio listarCondominio() {

    }*/

    /*public static Condominio changeCondominio(Condominio c) {
    }*/
}
