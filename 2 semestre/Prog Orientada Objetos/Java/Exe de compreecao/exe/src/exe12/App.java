package exe12;

public class App {
    public static void main(String[] args) {
        Account account = new Account("123456789", "João Silva", 1000.0);

        System.out.println("Número da Conta: " + account.getAccountNumber());
        System.out.println("Titular: " + account.getAccountHolder());
        System.out.println("Saldo Inicial: R$ " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Saldo após depósito: R$ " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Saldo após saque: R$ " + account.getBalance());
    }
}