package exe11;

public class House {
    private String endereco;
    private int numberOfRooms;
    private double area;

    public House(String endereco, int numberOfRooms, double area) {
        this.endereco = endereco;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculaPrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}