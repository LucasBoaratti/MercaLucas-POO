package MercaLucas;

public class ExibirProdutos {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Chocolate", 9.99);
        Produtos produto2 = new Produtos("Doritos", 15.99);
        Produtos produto3 = new Produtos("Laranja", 19.99);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();

        produto1.aplicarDesconto();
    }
}
