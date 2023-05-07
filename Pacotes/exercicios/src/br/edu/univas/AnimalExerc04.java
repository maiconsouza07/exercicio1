package br.edu.univas;

public class AnimalExerc04 {
    private String nome;
    private String especie;

    public AnimalExerc04(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void imprimirNomeEspecie() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public static void main(String[] args) {
        AnimalExerc04 animal = new AnimalExerc04("Gato", "Felino");
        animal.imprimirNomeEspecie();
    }
}
