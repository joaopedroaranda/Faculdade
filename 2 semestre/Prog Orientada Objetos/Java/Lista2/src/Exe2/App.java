package Exe2;

public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D();
        ponto1.setX(1.0);
        ponto1.setY(2.0);

        Ponto2D ponto2 = new Ponto2D(2.0,3.0);

        Ponto2D ponto3 = new Ponto2D(ponto2);
        System.out.println("X: " +ponto1.getX() +", Y: "+ ponto1.getY());

        ponto1.movimentar(5, -3);
        System.out.println("X: " +ponto1.getX() +", Y: "+ ponto1.getY());


    }
}
