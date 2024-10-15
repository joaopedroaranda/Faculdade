package exe10;

public class App {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("Dell", "Intel i7", 16);

        System.out.println("Marca: " + desktop.getMarca());
        System.out.println("Processador: " + desktop.getProcessador());
        System.out.println("Tamanho da RAM: " + desktop.getRamSize() + " GB");

        desktop.upgradeRam(16);
        System.out.println("Tamanho da RAM após upgrade: " + desktop.getRamSize() + " GB");
    }
}