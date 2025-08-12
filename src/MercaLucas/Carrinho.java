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

    //Método de mostrar o resumo das compras
    public void mostrarResumo() {
        System.out.println("Resumo da compra: ");

        double totalCompra = 0;

        //Laço for que calcula o subtotal da compra e acumula no total da compra
        for (int i = 0; i < produtos.size(); i++) {
            Produtos prod = produtos.get(i);
            int quant = quantidades.get(i);

            double subtotal = prod.preco * quant;

            System.out.println("Produto: " + prod.nome + " | Preço: " + prod.preco + " | Quantidade: " + quant + " | Subtotal: " + subtotal);

            totalCompra += subtotal;
        }
        System.out.println("Total da compra: " + totalCompra);
    }
}
