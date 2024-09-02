package Aula3;

public class Produto {

    private String name;
    private TipoDeProduto tipo;
    private Double valor;

    public Produto(String nome, TipoDeProduto tipo, Double valor) {
        this.name = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public TipoDeProduto getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + name + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}
