import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Smartphone", TipoDeProduto.ELETRONICO, 299.99);
        Produto produto2 = new Produto("Camisa", TipoDeProduto.VESTUARIO, 49.99);
        Produto produto3 = new Produto("Livro de Java", TipoDeProduto.LIVRO, 29.99);
        Produto produto4 = new Produto("Arroz", TipoDeProduto.ALIMENTO, 15.49);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        Compra compra = new Compra();
        compra.setListaDeProdutos(listaDeProdutos);
        compra.setNfe(12345); // Definir o número da nota fiscal

        Double totalImposto = compra.calcularImposto();
        Double valorCompra = compra.calculaValorCompra();

        System.out.println("Número da Nota Fiscal: " + compra.getNfe());
        System.out.println("Produtos na Compra:");
        for (Produto prod : compra.getListaDeProdutos()) {
            System.out.println(prod);
        }
        System.out.println("Valor Total da Compra: R$ " + valorCompra);
        System.out.println("Total de Imposto: R$ " + totalImposto);
    }
}
