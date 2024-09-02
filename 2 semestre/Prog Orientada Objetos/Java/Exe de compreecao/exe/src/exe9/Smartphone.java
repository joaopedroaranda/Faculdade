package exe9;

public class Smartphone {

    private String marca;
    private String modelo;
    private int storageCapacity;

    // Getters e Setters para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getters e Setters para modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getters e Setters para storageCapacity
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Método para aumentar a capacidade de armazenamento
    public void boostStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
        } else {
            System.out.println("O valor de armazenamento adicional deve ser positivo.");
        }
    }
}