import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o número da conta: ");
        String contaCliente = scanner.next();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo:");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agencia é " + agenciaCliente + ", conta " + contaCliente + " e seu saldo é " + saldoCliente + " já está disponível para saque.");

    }

}
