package br.edu.univas;

// exercicio05

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        carro1.imprimirInformacoes();

        Carro carro2 = new Carro("Ford", "Mustang", 2023);
        carro2.imprimirInformacoes();
    }
}

