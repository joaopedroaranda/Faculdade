package Aula3;

import java.util.ArrayList;

public class main {
    public static void Main(String[] args) {
        // Criar alguns produtos
        Produto produto1 = new Produto("Smartphone", TipoDeProduto.ELETRONICO, 299.99);
        Produto produto2 = new Produto("Camisa", TipoDeProduto.VESTUARIO, 49.99);
        Produto produto3 = new Produto("Livro de Java", TipoDeProduto.LIVRO, 29.99);
        Produto produto4 = new Produto("Arroz", TipoDeProduto.ALIMENTO, 15.49);

        // Criar uma lista de produtos e adicionar produtos a ela
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        // Criar uma compra e adicionar a lista de produtos
        Compra compra = new Compra();
        compra.setListaDeProdutos(listaDeProdutos);
        compra.setNfe(12345); // Definir o número da nota fiscal

        // Calcular imposto e valor total da compra
        Double totalImposto = compra.calcularImposto();
        Double valorCompra = compra.calculaValorCompra();

        // Exibir resultados
        System.out.println("Número da Nota Fiscal: " + compra.getNfe());
        System.out.println("Produtos na Compra:");
        for (Produto prod : compra.getListaDeProdutos()) {
            System.out.println(prod);
        }
        System.out.println("Valor Total da Compra: R$ " + valorCompra);
        System.out.println("Total de Imposto: R$ " + totalImposto);
    }
}

