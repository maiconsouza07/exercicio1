package br.edu.univas;

// exercicio10

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "Rua A, 123", "(11) 99999-9999");
        cliente1.imprimirInformacoes();

        Cliente cliente2 = new Cliente("Maria", "Av. B, 456", "(11) 88888-8888");
        cliente2.imprimirInformacoes();
    }
}

