package MercaLucas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produtos produtos;
        Carrinho carrinho;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao MercaLucas! Para começar, digite suas informações para entrar no Mercadinho :D");

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu email: ");
        String email = input.nextLine();

        Cliente cliente = new Cliente(nome, email);

        cliente.mostrarDados();
    }
}
