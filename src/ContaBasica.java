public class ContaBasica extends Conta {

    public ContaBasica ( double initialBalance ) {
        super(initialBalance);
    }

    @Override
    public void deposit(double value) {
        if ( value > 0 ) {
            balance += value;
            System.out.println("Depósito de R$" + value + " realizado com êxito");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    @Override
    public void withdrawal(double value) throws Exception {
        if ( value > 0 ) {
            if ( balance < value ) {
                balance -= value;
                System.out.println("Saque de R$" + value + " realizado com êxito");
            } else {
                throw new Exception("Saldo insuficiente para efetuarmos o saque");
            }
        } else {
            throw new Exception("O valor do saque deve ser positivo.");
        }

    }

    @Override
    public void transfer(double value, Conta destinationAccount) throws Exception {
        if (value > 0) {
            if (value <= balance) {
                balance -= value;
                destinationAccount.deposit(value);
                System.out.println("Transferência de R$" + value + " realizada com êxito.");
            } else {
                throw new Exception("Saldo insuficiente para efetuarmos a transacao");
            }
        } else {
            throw new Exception("O valor do saque deve ser positivo.");

        }
    }
}