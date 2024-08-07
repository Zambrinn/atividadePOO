public abstract class Conta {
    protected double balance;

    public Conta(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double value);

    public abstract void withdrawal(double value) throws Exception;

    public abstract void transfer(double value, Conta destinationAccount) throws Exception;

    public void showBalance() {
        System.out.println("Saldo atual: " + balance);
    }
}