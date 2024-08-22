package exe2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        List<BankAccount> contas =  new ArrayList<>();

        for(int i=0 ; i < 3 ; i++){
            BankAccount conta = new BankAccount();

            System.out.print("Digite o numero da sua conta: ");
            conta.setAccountNumber(input.nextInt());

            System.out.print("Qual seu saldo: ");
            conta.setBalance(input.nextDouble()); // na hora da entrada ele entende a "," como separador mas mostrando ele apresenta com "."

            contas.add(conta);
        }

        for(BankAccount conta : contas){
            System.out.println("Digite o numero da sua conta: " + conta.getAccountNumber());
            System.out.println("Qual seu saldo: " + conta.getBalance());

        }
    }
}
