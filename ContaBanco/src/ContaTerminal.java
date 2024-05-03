import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int contaCliente;
        String agenciaCliente;
        String nomeCliente;
        double saldoCliente;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next().toUpperCase();
        System.out.println("Por favor, digite o numero conta: ");
        contaCliente = scanner.nextInt();
        System.out.println("Por favor, digite o numero agencia: ");
        agenciaCliente = scanner.next();
        System.out.println("Por favor, digite o saldo atual: ");
        saldoCliente = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agenciaCliente, contaCliente, saldoCliente));
    }
}
