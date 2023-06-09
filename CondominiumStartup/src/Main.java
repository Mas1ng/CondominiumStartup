import controllers.Controller;
import mock.MockData;
import repository.FilesOperation;
import model.Company;
import views.CompanyView;
import views.GeneralView;
import model.Contact;

public class Main {

    public static void main(String[] args) {
        GeneralView.writeText( "Inicializando aplicação de Gestão de Empresas...");
        Company company = null;
        int option = GeneralView.loadMenu();
        switch (option){
            case 1:
                company = CompanyView.createCompany();
                break;
            case 2:
                company = FilesOperation.carregarDados();
                System.out.println(company.getNome());
                System.out.println(company.getContact());
                break;
            case 3:
                System.out.println("MOCK");
                Contact contact = new Contact(999999999);
                company = new Company("ABCD",contact);
                MockData mock = new MockData();
                mock.generateData(company);
                break;
            case 0:
                System.out.println("A cancelar...");
                break;
            default:
                GeneralView.writeText("Not an option");
        }

        if (company != null){
            Controller controller = new Controller(company);
            company = controller.run();//caso haja empresa ele entra no run
            FilesOperation.guardarDados(company);
        }
    }


}
