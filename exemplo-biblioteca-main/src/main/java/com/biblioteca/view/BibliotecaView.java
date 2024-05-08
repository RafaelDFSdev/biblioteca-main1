package view;

import java.util.Scanner;

public class BibliotecaView {
  private Scanner scanner;

  public BibliotecaView() {
    scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    System.out.println("Menu:");
    System.out.println("1. Cadastrar Livro");
    System.out.println("2. Listar Livros");
    System.out.println("3. Emprestar Livro");
    System.out.println("4. Devolver Livro");
    System.out.println("5. Sair");
  }

  public int lerOpcaoMenu() {
    System.out.print("Escolha uma opção: ");
    try {
      String input = scanner.nextLine();
      return Integer.parseInt(input);
    } catch (NumberFormatException e) {
      System.out.println("Opção inválida. Digite um número válido.");
      return lerOpcaoMenu();
    }
  }



  public String lerTituloLivro() {
    System.out.print("Digite o título do livro: ");
    return scanner.nextLine();
  }
}
