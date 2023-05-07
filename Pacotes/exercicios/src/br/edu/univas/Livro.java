package br.edu.univas;

// exercico07

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        livro1.imprimirInformacoes();

        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        livro2.imprimirInformacoes();
    }
}

