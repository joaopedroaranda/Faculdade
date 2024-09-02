package exe9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        Smartphone smartphone = new Smartphone();

        // Configurando os valores de marca, modelo e capacidade de armazenamento
        smartphone.setMarca("Samsung");
        smartphone.setModelo("Galaxy S21");
        smartphone.setStorageCapacity(128);

        // Exibindo as informações iniciais
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Modelo: " + smartphone.getModelo());
        System.out.println("Capacidade de Armazenamento: " + smartphone.getStorageCapacity() + "GB");

        // Aumentando a capacidade de armazenamento
        smartphone.boostStorage(64);

        // Exibindo as informações após aumentar o armazenamento
        System.out.println("Nova Capacidade de Armazenamento: " + smartphone.getStorageCapacity() + "GB");
    }
}