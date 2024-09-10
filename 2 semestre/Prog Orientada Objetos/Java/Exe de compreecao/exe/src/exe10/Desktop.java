package exe10;

public class Desktop {
    private String marca;
    private String processador;
    private int ramSize;

    public Desktop(String marca, String processador, int ramSize) {
        this.marca = marca;
        this.processador = processador;
        this.ramSize = ramSize;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void upgradeRam(int valor) {
        this.ramSize += valor;
    }
}
