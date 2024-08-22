package exe5;

public class Circle {
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {  // nao pode ser menor ou igual a 0
            this.radius = radius;
        } else {
            System.out.println("O raio deve ser maior que zero.");
        }
    }

    public Double calculaArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double calculaPerimeter() {
        return 2 * Math.PI * radius;
    }
}
