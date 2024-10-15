package exe1;

public class App {
    public static void main(String[] args){

        Contador um = new Contador();

        um.incrementarContador();
        um.incrementarContador();
        um.incrementarContador();
        System.out.println("Contador : "+ um.mostrarContador());
        um.zerarContador();
        System.out.println("Contador : "+ um.mostrarContador());
       
    }
}
