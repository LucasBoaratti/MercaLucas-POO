package MercaLucas;

import java.util.ArrayList;

public class Carrinho {
    //ArrayLists que guardam os produtos e as quantidades de cada item
    ArrayList<Produtos> produtos = new ArrayList<>();
    ArrayList<Integer> quantidades = new ArrayList<>();

    //Método de adicionar produto que insere o produto e a quantidade em suas listas
    public void adicionarProduto(Produtos produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public void aplicarDesconto(String nomeProduto) {
        boolean produtoEncontrado = false;

        for (int i = 0; i < produtos.size(); i++) {
            Produtos prod = produtos.get(i);

            if (prod.nome.equalsIgnoreCase(nomeProduto)) {
                double precoDesconto = prod.aplicarDesconto() * quantidades.get(i);

                System.out.println("Preço total com desconto: " + prod.nome + " R$ " + String.format("%2.2f", precoDesconto));

                produtoEncontrado = true;

                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    //Método de mostrar o resumo das compras
    public void mostrarResumo() {
        double totalCompra = 0;

        //Laço for que calcula o subtotal da compra e acumula no total da compra
        for (int i = 0; i < produtos.size(); i++) {
            Produtos prod = produtos.get(i);
            int quant = quantidades.get(i);

            double subtotal = prod.preco * quant;

            System.out.println(prod.nome + " | Preço: " + prod.preco + " | Quantidade: " + quant + " | Subtotal: " + subtotal);

            totalCompra += subtotal;
        }
        System.out.println("Total da compra: R$" + totalCompra);
    }
}
