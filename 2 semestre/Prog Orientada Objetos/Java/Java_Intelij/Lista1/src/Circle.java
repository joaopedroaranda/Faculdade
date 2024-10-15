public class Circle {

    private double raio;
    private double pi = 3.14;

    public Circle(){

    }

    public Circle(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    public String calcularArea(){
        double area;
        area = Math.PI * Math.pow(getRaio(),2.0);

        String areaFormatada = String.format("%.2f", area);
        return areaFormatada;
    }

    public String Perimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * getRaio();
        String perimetroFormatado = String.format("%.2f", perimetro);
        return perimetroFormatado;
    }

    public static void main(String[] args) {

        Circle exe = new Circle(3);

        System.out.println("Area = " + exe.calcularArea());
        System.out.println("Perimetro = " + exe.Perimetro());

    }
}
