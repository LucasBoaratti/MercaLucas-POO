package MercaLucas;

public class ExibirTotalCompra {
    public static void main(String[] args) {
        Produtos produto;

        Produtos produto1 = new Produtos("Chocolate", 9.99);
        Produtos produto2 = new Produtos("Doritos", 15.99);
        Produtos produto3 = new Produtos("Laranja", 19.99);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1, 5);
        carrinho.adicionarProduto(produto2, 2);
        carrinho.adicionarProduto(produto3, 10);

        carrinho.mostrarResumo();
    }
}
