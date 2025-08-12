package MercaLucas;

public class Produtos {
    String nome;
    double preco;

    //Construtor que instancia o nome e o preco dos produtos
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Método que exibe as informações dos produtos
    public void exibirInfo() {
        System.out.println("Produto: " + nome + " ; Preço: " + preco);
    }

    //Método que aplica o desconto nos produtos
    public void aplicarDesconto() {
        double desconto = preco * 0.10;

        double precoDesconto = preco - desconto;

        System.out.println(String.format("Desconto de 10%% no produto %s: R$ %.2f", nome, desconto));
        System.out.println(String.format("Preço atual com desconto: R$ %.2f", precoDesconto));
    }
}
