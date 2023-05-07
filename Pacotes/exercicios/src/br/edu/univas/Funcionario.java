package br.edu.univas;

// exercicio08

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "Programador", 5000.0);
        funcionario1.imprimirInformacoes();

        Funcionario funcionario2 = new Funcionario("Maria", "Analista de Sistemas", 7000.0);
        funcionario2.imprimirInformacoes();
    }
}

