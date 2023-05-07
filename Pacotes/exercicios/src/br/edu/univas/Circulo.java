package br.edu.univas;

// exercicio09

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.0);
        System.out.println("Área do círculo 1: " + circulo1.calcularArea());

        Circulo circulo2 = new Circulo(2.5);
        System.out.println("Área do círculo 2: " + circulo2.calcularArea());
    }
}

