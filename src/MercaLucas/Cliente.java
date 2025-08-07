package MercaLucas;

public class Cliente {
    String nome;
    String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void mostrarDados() {
        System.out.println("Olá, " + nome + ", aproveite os nossos produtos!");
        System.out.println("Seu email: " + email);
    }
}
