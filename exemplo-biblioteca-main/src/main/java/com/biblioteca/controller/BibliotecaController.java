package controller;

import model.Database;
import model.Livro;
import view.BibliotecaView;

public class BibliotecaController {
  private Database database;
  private BibliotecaView view;

  public BibliotecaController(Database database, BibliotecaView view) {
    this.database = database;
    this.view = view;
  }

  public void cadastrarLivro() {
    String titulo = view.lerTituloLivro();
    String autor = "";
    Livro livro = new Livro(titulo, autor, true);
    database.cadastrarLivro(livro);
    System.out.println("Livro cadastrado com sucesso!");
  }

  public void listarLivros() {
    System.out.println("Lista de Livros:");
    for (Livro Livro : database.listarLivros()) {
      System.out.println(Livro);
    }
  }

  public void emprestarLivro() {
    String titulo = view.lerTituloLivro();
    database.emprestarLivro(titulo);
    System.out.println("Livro emprestado com sucesso!");
  }

  public void devolverLivro() {
    String titulo = view.lerTituloLivro();
    database.devolverLivro(titulo);
    System.out.println("Livro devolvido com sucesso!");
  }
}
