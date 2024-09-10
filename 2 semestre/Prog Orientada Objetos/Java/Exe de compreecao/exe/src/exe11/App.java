package exe11;

public class App {
    public static void main(String[] args) {
        House house = new House("Rua das Flores, 123", 3, 150.0);

        System.out.println("Endereço: " + house.getEndereco());
        System.out.println("Número de Quartos: " + house.getNumberOfRooms());
        System.out.println("Área: " + house.getArea() + " m²");

        double pricePerSquareMeter = 3000.0; // Exemplo de preço por metro quadrado
        double price = house.calculaPrice(pricePerSquareMeter);
        System.out.println("Preço da Casa: R$ " + price);
    }
}