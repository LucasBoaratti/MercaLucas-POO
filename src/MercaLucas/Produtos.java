package MercaLucas;

public class Produtos {
    String nome;
    double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " ; Preço: " + preco);
    }

    public void aplicarDesconto() {
        double desconto = preco * 0.10;

        double precoDesconto = preco - desconto;

        System.out.println(String.format("Desconto de 10%% no produto %s: R$ %.2f", nome, desconto));
        System.out.println(String.format("Preço atual com desconto: R$ %.2f", precoDesconto));
    }
}
