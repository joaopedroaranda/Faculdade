public class BankAccount {

    private int conta;
    private double saldo;

    public BankAccount(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + conta + ", Saldo: " + saldo;
    }

    public static void main(String[] args) {

        BankAccount conta1 = new BankAccount(12345, 123);

        System.out.println(conta1);

    }
}