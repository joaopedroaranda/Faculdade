package exe5;

import java.util.Scanner;


public class App {  

    public static void main(String[] args) throws Exception {

        Circle circulo = new Circle();

        circulo.setRadius(5.0);

        // Exibindo o valor do raio
        System.out.println("Raio: " + circulo.getRadius());

        // Calculando e exibindo a área
        System.out.println("Área: " + circulo.calculaArea());

        // Calculando e exibindo o perímetro
        System.out.println("Perímetro: " + circulo.calculaPerimeter());
        
    }
}