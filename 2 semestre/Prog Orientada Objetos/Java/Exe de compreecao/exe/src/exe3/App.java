package exe3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Rectangle lados = new Rectangle();
        
        List<Rectangle> lado = new ArrayList<>();

        System.out.print("Digite o comprimento: ");
        lados.setComprimento(input.nextDouble());

        System.out.print("Digite a largura: ");
        lados.setLargura(input.nextDouble());

        lado.add(lados);
        
    }
}
