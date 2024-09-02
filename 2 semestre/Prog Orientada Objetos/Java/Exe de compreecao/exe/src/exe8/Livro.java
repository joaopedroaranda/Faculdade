package exe8;

public class Livro {

    private String title;
    private String autor;
    private Double preco;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter e Setter para autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter e Setter para preco
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Método para aplicar desconto
    public void applyDiscount(Double desconto) {
        if (desconto >= 0 && desconto <= 100) {
            this.preco = preco - (preco * desconto / 100);
        } else {
            System.out.println("Desconto inválido! O desconto deve estar entre 0% e 100%.");
        }
    }

    // Método para obter o preço após desconto
    public Double getPrecoComDesconto() {
        return preco;
    }
}
