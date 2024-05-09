package controller;
import java.util.List;

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
    List<Livro> livros = database.listarLivros();
    if (livros.isEmpty()) {
      System.out.println("Nenhum livro cadastrado.");
    } else {
      System.out.println("Lista de Livros:");
      for (Livro livro : livros) {
        System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
      }
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
