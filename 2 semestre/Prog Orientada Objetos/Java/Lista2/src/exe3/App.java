package exe3;

public class App {
    public static void main(String[] args) throws Exception {

        NumeroComplexo num1 = new NumeroComplexo(2,3);
        NumeroComplexo num2 = new NumeroComplexo(1,7);

        System.out.println(num1);
        num1.somar(num1);
        System.out.println(num1);
        num1.subtrair(num2);
        System.out.println(num1);

    }
}
