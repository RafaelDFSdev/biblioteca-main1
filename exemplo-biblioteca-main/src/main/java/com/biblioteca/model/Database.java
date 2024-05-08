package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Livro> livros;

    public Database() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setDisponivel(false);
                break;
            }
        }
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setDisponivel(true);
                break;
            }
        }
    }
}
