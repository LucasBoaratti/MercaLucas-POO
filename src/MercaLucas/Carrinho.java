package MercaLucas;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produtos> produtos = new ArrayList<>();
    ArrayList<Integer> quantidades = new ArrayList<>();

    public void adicionarProduto(Produtos produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public void mostrarResumo() {
        System.out.println("Resumo da compra: ");

        double totalCompra = 0;

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
