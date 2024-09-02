package Aula3;

public enum TipoDeProduto {
    ELETRONICO(1),
    VESTUARIO(2),
    ALIMENTO(3),
    LIVRO(4);

    private final int valor;

    TipoDeProduto(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
