package MercaLucas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner com a entrada de dados

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

        //Objeto carrinho que guarda os produtos que o usuário vai escolher
        Carrinho carrinho = new Carrinho();
        //Variável que vai contar quantos produtos foram adicionados
        int produtosAdicionados = 0;

        //Laço for para percorrer os produtos escolhidos pelo usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDigite o nome do produto: ");
            String nomeProduto = input.nextLine().toLowerCase();

            System.out.println("\nDigite o preço do produto: ");
            double precoProduto = input.nextDouble();
            input.nextLine();

            System.out.println("\nDigite a quantidade do produto: ");
            int quantidadeProduto = input.nextInt();
            input.nextLine();

            //Validações dos produtos, seus preços e suas quantidades
            if (nomeProduto.equals("chocolate") && precoProduto == 9.99) {
                System.out.println("Produto, preço e quantidade adicionados.\n");
            }
            else if (nomeProduto.equals("doritos") && precoProduto == 15.99) {
                System.out.println("Produto, preço e quantidade adicionados.\n");
            }
            else if (nomeProduto.equals("laranja") && precoProduto == 19.99) {
                System.out.println("Produto, preço e quantidade adicionados.\n");
            }
            else {
                System.out.println("Produto ou preço incorreto.");
                i--;
                continue; //Repete a iteração para o usuário corrigir
            }

            //Criando um objeto produtos e adiciona no carrinho com a quantidade
            Produtos produtos = new Produtos(nomeProduto, precoProduto);
            carrinho.adicionarProduto(produtos, quantidadeProduto);

            //Mostrando os produtos adicionados
            System.out.println("Produtos adicionados: ");
            carrinho.mostrarResumo();

            produtosAdicionados++;

            System.out.println("\nVocê deseja continuar comprando os produtos? (digite sim ou não): ");
            String escolha = input.nextLine().toLowerCase();

            //Verificando se o usuário não quer continuar comprando
            if (escolha.equals("nao") || escolha.equals("n") || escolha.equals("não")) {
                System.out.println("\nVocê tem um desconto de 50% para aplicar em um produto 🥳");
                System.out.println("Digite o nome do produto para aplicar o desconto: ");
                String desconto = input.nextLine().toLowerCase().trim();

                //Aplicando o desconto
                carrinho.aplicarDesconto(desconto);

                System.out.println("Muito obrigado por comprar na MercaLucas!");

                break;
            }
        }
        input.close(); //Fechando o scanner de entrada de dados
    }
}
