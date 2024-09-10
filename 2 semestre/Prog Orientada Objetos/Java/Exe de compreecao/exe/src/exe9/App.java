package exe9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 128);

        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Modelo: " + smartphone.getModelo());
        System.out.println("Capacidade de Armazenamento: " + smartphone.getCapacidadeDeArmazenamento() + " GB");

        smartphone.boostStorage(64);
        System.out.println("Capacidade de Armazenamento após aumento: " + smartphone.getCapacidadeDeArmazenamento() + " GB");
    }
}