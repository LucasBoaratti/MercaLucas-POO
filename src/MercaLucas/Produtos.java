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
    public double aplicarDesconto() {
        double desconto = preco * 0.50;

        return preco - desconto;
    }
}
