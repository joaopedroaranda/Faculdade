package exe3;

public class NumeroComplexo {
    
    private double real;
    private double imaginary;

    // Construtores

    public NumeroComplexo(){

    }

    public NumeroComplexo(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // Get e setters

    public void setReal(double real){
        this.real = real;
    }
    public Double getReal(){
        return real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public Double getImaginary(){
        return imaginary;
    }

    // Metodos
    
    public void somar(NumeroComplexo outro){
        this.real += outro.getReal();
        this.imaginary += outro.getImaginary();
    }

    public void subtrair(NumeroComplexo outro){
        this.real -= outro.getReal();
        this.imaginary -= outro.getImaginary();
    }

    public void multiplicar(NumeroComplexo outro){
        this.real = real * outro.getReal();
        this.imaginary = imaginary *  outro.getImaginary();
    }

    public void dividir(NumeroComplexo outro){
        this.real = real / outro.getReal();
        this.imaginary = imaginary / outro.getImaginary();
    }
    
    public boolean comparar(NumeroComplexo outro){
        return this.real == outro.getReal() && this.imaginary == outro.getImaginary();
    }

    public double modulo() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
    // usando isso facilita na hora de mostrarmos nossa instacia.
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }


}
