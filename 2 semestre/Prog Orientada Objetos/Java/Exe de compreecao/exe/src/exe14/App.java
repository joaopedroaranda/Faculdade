package exe14;

public class App {

    public static void main(String[] args) {
    Produto produto = new Produto("Smartphone", "XYZ123", 1500.0);

        System.out.println("Nome do Produto: " + produto.getProductName());
        System.out.println("Código do Produto: " + produto.getProductCode());
        System.out.println("Preço Original: R$ " + produto.getPrice());

        produto.applyDiscount(10.0); // Aplicar um desconto de 10%
        System.out.println("Preço após Desconto: R$ " + produto.getPrice());
    }
}