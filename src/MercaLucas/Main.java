package MercaLucas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Mensagem de boas vindas
        System.out.println("Olá, seja bem vindo(a) ao MercaLucas! Para começar, digite suas informações para entrar no Mercadinho :D");

        //Cadastro do cliente, com as letras convertidas para minúsculas
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine().toLowerCase();

        System.out.println("Digite seu email: ");
        String email = input.nextLine().toLowerCase();

        //Validações do cadastro
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

        //Criando 3 produtos fixos para o mercado
        Produtos produto1 = new Produtos("Chocolate", 9.99);
        Produtos produto2 = new Produtos("Doritos", 15.99);
        Produtos produto3 = new Produtos("Laranja", 19.99);

        //Exibindo os produtos para o usuário
        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();

        String[] listaProdutos = new String[3];
        double[] listaPrecos = new double[3];
        int produtosAdicionados = 0;

        //Laço for para percorrer os produtos escolhidos pelo usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDigite o nome do produto: ");
            listaProdutos[i] = input.nextLine().toLowerCase();

            System.out.println("\nDigite o preço do produto: ");
            listaPrecos[i] = input.nextDouble();
            input.nextLine();

            //Validações dos produtos e seus preços
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
                continue;
            }

            produtosAdicionados++;

            System.out.println("Você deseja continuar comprando os produtos? (digite sim ou não): ");
            String escolha = input.nextLine().toLowerCase();

            //Verificando se o usuário não quer continuar comprando
            if (escolha.equals("nao") || escolha.equals("n") || escolha.equals("não")) {
                System.out.println("Produtos adicionados: ");
                //Exibindo os produtos comprados
                for (int j = 0; j < produtosAdicionados; j++) {
                    System.out.printf("- " + listaProdutos[j] + ": R$ " + listaPrecos[j] + "\n");
                }

                System.out.println("Você tem um desconto de 40% para aplicar em um produto 🥳");
                System.out.println("Digite o nome do produto para aplicar o desconto: ");
                String desconto = input.nextLine().toLowerCase().trim();

                //Laço for para percorrer o item escolhido pelo usuário para aplicar o desconto
                for (int k = 0; k < listaProdutos.length; k++) {
                    //Aplicando o desconto
                    if (listaProdutos[k].equals(desconto)) {
                        double valorDesconto = listaPrecos[k] * 0.4;
                        double valorTotal = listaPrecos[k] - valorDesconto;

                        System.out.println(String.format("O valor total do produto é de: R$ %.2f", valorTotal));
                        System.out.println("Muito obrigado por comprar na MercaLucas!");

                        break;
                    }
                }
                break;
            }
        }
    }
}
