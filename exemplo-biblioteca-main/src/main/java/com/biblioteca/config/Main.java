import controller.BibliotecaController;
import model.Database;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        BibliotecaView view = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(database, view);

        while (true) {
            view.mostrarMenu();
            int opcao = view.lerOpcaoMenu();

            switch (opcao) {
                case 1:
                    controller.cadastrarLivro();
                    break;
                case 2:
                    controller.listarLivros();
                    break;
                case 3:
                    controller.emprestarLivro();
                    break;
                case 4:
                    controller.devolverLivro();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
