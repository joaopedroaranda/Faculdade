package exe4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        Funcionario emp = new Funcionario();

        System.out.print("Digite seu ID: ");
        emp.setEmployee_id(input.nextInt());
        System.out.print("Digite seu Nome: ");
        input.nextLine();
        emp.setEmployee_name(input.nextLine());
        System.out.print("Digite seu Salario: ");
        emp.setEmployee_salary(input.nextDouble());

        System.out.println();
        
        System.out.println("ID: " + emp.getEmployee_id());
        System.out.println("Name: " + emp.getEmployee_name());
        System.out.println("Salary: " + emp.getEmployee_salary());
    }
}
