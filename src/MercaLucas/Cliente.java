package MercaLucas;

public class Cliente {
    String nome;
    String email;

    //Construtor que instancia o nome e o email do cliente
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Método que mostra os dados do cliente
    public void mostrarDados() {
        System.out.println("Olá, " + nome + ", aproveite os nossos produtos!");
        System.out.println("Seu email: " + email);
    }
}
