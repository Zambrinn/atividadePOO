import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta minhaContaBasica = new ContaBasica(1670);
        Conta minhaContaPremium = new ContaPremium(2234354);
        int option;

        do {
            System.out.println("\nInforme uma opção para prosseguirmos: ");
            System.out.println("1 - Depositar na Conta Básica");
            System.out.println("2 - Sacar da Conta Básica ");
            System.out.println("3 - Transferir da Conta Básica para a Conta Premium");
            System.out.println("4 - Depositar na Conta Premium");
            System.out.println("5 - Sacar da Conta Premium");
            System.out.println("6 - Transferir da Conta Premium para a Conta Básica");
            System.out.println("7 - Mostrar Saldo");
            System.out.println("8 - Sair\n");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Informe um valor para depositarmos na conta basica: ");
                    double BasicAccountDepositValue = scanner.nextDouble();
                    minhaContaBasica.deposit(BasicAccountDepositValue);
                    break;
                case 2:
                    System.out.println("Informe um valor para sacarmos da conta basica: ");
                    double BasicAccountWithdrawValue = scanner.nextDouble();
                    minhaContaBasica.withdrawal(BasicAccountWithdrawValue);
                    break;
                case 3:
                    System.out.println("Informe o valor que quer transferir da conta basica para a conta premium: ");
                    double PremiumAccountTransferValue = scanner.nextDouble();
                    minhaContaBasica.transfer(PremiumAccountTransferValue, minhaContaPremium);
                    break;
                case 4:
                    System.out.println("Informe um valor para depositarmos na conta premium: ");
                    double PremiumAccountDepositValue = scanner.nextDouble();
                    minhaContaBasica.deposit(PremiumAccountDepositValue);
                    break;
                case 5:
                    System.out.println("Informe um valor para sacarmos da conta premium: ");
                    double PremiumAccountWithdrawValue = scanner.nextDouble();
                    minhaContaBasica.withdrawal(PremiumAccountWithdrawValue);
                    break;
                case 6:
                    System.out.println("Informe o valor que quer transferir da conta premium para a conta basica: ");
                    double BasicAccountTransferValue = scanner.nextDouble();
                    minhaContaBasica.transfer(BasicAccountTransferValue, minhaContaBasica);
                    break;
                case 7:
                    System.out.println("Saldo da Conta Básica:");
                    minhaContaBasica.showBalance();
                    System.out.println("Saldo da Conta Premium:");
                    minhaContaPremium.showBalance();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while ( option != 8 );
        scanner.close();
    }
}