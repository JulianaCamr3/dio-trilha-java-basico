import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor, digite o seu número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo que deseja depositar: ");
        float saldoCliente = scanner.nextFloat();

        scanner.close();

        System.out.println("\nOlá, " + nomeCliente + "sua agência e seu número de conta é: " + numeroAgencia + numeroConta);
        System.out.println("\nO seu novo saldo é de: " + saldoCliente );;
    }
}
