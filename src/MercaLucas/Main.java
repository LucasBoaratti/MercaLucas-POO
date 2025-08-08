package MercaLucas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao MercaLucas! Para começar, digite suas informações para entrar no Mercadinho :D");

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine().toLowerCase();

        System.out.println("Digite seu email: ");
        String email = input.nextLine().toLowerCase();

        if (nome.isEmpty() && email.isEmpty()) {
            System.out.println("Digite seu nome e sua senha, por favor.");
            return;
        }
        else if (nome.isEmpty()) {
            System.out.println("Digite seu nome, por favor.");
            return;
        }
        else if (email.isEmpty()) {
            System.out.println("Digite seu email, por favor.");
            return;
        }
        else if (nome.equals("lucas") && email.equals("lucas@email.com")) {
            Cliente cliente = new Cliente(nome, email);
            cliente.mostrarDados();
        }
        else {
            System.out.println("Usuário, não cadastrado, ou senha incorretos.");
            return;
        }

        System.out.println("\nAgora, você irá escolher três produtos para comprar:\n");

        Produtos produto1 = new Produtos("Chocolate", 9.99);
        Produtos produto2 = new Produtos("Doritos", 15.99);
        Produtos produto3 = new Produtos("Laranja", 19.99);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();

        String[] listaProdutos = new String[3];
        double[] listaPrecos = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDigite o nome do produto: ");
            listaProdutos[i] = input.nextLine().toLowerCase();

            System.out.println("\nDigite o preço do produto: ");
            listaPrecos[i] = input.nextDouble();
            input.nextLine();

            if (listaProdutos[i].equals("chocolate") && listaPrecos[i] == 9.99) {
                System.out.println("Produto e preço adicionado.\n");
            }
            else if (listaProdutos[i].equals("doritos") && listaPrecos[i] == 15.99) {
                System.out.println("Produto e preço adicionado.\n");
            }
            else if (listaProdutos[i].equals("laranja") && listaPrecos[i] == 19.99) {
                System.out.println("Produto e preço adicionado.\n");
            }
            else {
                System.out.println("Produto ou preço incorreto.");
                i--;
                return;
            }

            System.out.println("Você deseja continuar comprando os produtos? (digite sim ou não): ");
            String escolha = input.nextLine().toLowerCase();

            System.out.println("Produtos adicionados: ");

            if (escolha.equals("nao") || escolha.equals("n") || escolha.equals("não")) {
                for (int j = 0; j < listaProdutos.length; j++) {
                    System.out.printf("- " + listaProdutos[j] + ": R$ " + listaPrecos[j] + "\n");

                    System.out.println("Você tem um desconto de 10% para aplicar em um produto 🥳 Aplique o desconto em um produto, por favor: \n" + listaProdutos[j]);
                    break;
                }
            }
            break;
        }
    }
}
