package exe9;

public class Smartphone {
    private String marca;
    private String modelo;
    private int capacidadeDeArmazenamento;

    public Smartphone(String marca, String modelo, int capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public void boostStorage(int valor) {
        this.capacidadeDeArmazenamento += valor;
    }
}
