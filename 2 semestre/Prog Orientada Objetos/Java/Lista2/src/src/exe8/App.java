package exe8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        Livro livro = new Livro();
        livro.setTitle("Java Programming");
        livro.setAutor("Autor Desconhecido");
        livro.setPreco(100.0);

        System.out.println("Preço original: R$ " + livro.getPreco());

        // Aplicando um desconto de 10%
        livro.applyDiscount(10.0);

        System.out.println("Preço com desconto: R$ " + livro.getPrecoComDesconto());
        
    }
}