package br.edu.univas;

// exercicio06

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10.0, 5.0);
        System.out.println("Área do triângulo 1: " + triangulo1.calcularArea());

        Triangulo triangulo2 = new Triangulo(7.0, 3.0);
        System.out.println("Área do triângulo 2: " + triangulo2.calcularArea());
    }
}
