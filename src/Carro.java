public class Carro {
    String cor;
    String marca;
    String modelo;
    int velocidadeAtual;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
    }

    public void ligar() {
        System.out.println("O carro " + this.modelo + " ligou!");
    }

    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;

        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " Km/h");
    }

    public void frear(int decremento) {
        if (this.velocidadeAtual - decremento >= 0) {
            this.velocidadeAtual -= decremento;

            System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " Km/h");
        }
        else {
            this.velocidadeAtual = 0;

            System.out.println("O carro foi de arrasta.");
        }
    }

    public void desligar() {
        System.out.println("O carro " + this.modelo + " desligou.");
    }

    public void exibirInformacoes() {
        System.out.println("🚗 Informações do carro 🚗");

        System.out.println("✅ Marca: " + this.marca);

        System.out.println("🚗 Modelo: " + this.modelo);

        System.out.println("🩷 Cor: " + this.modelo);

        System.out.println("🌪️ Velocidade atual: " + this.velocidadeAtual);

        System.out.println("🚗 Fim das informações do carro 🚗");
    }
}
