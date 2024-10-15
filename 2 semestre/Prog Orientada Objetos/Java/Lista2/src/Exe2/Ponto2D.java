package Exe2;

public class Ponto2D {
    private double x;
    private double y;


    // sobrecarga são 3 ou mais parametros com mesmo nome mas a diferenciação é feita atravez do  
    public Ponto2D() { // defoult

    }

    public Ponto2D(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {

        this.x = ponto.getX();
        this.y = ponto.getY();
    }

    public double getX() {
        return x;
    }

    // Setter para x
    public void setX(double x) {
        this.x = x;
    }

    // Getter para y
    public double getY() {
        return y;
    }

    // Setter para y
    public void setY(double y) {
        this.y = y;
    }

    public void movimentar(double deltaX, double deltaY) { // tipo de retorno, quando não retorna nada
        this.x = x += deltaX;
        this.y = y += deltaY; // movimentação
    }
    
}
