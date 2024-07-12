import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite o número da agência: ");
        conta.setAgencia(scanner.next());

        System.out.println("Digite seu nome: ");
        conta.setCliente(scanner.next());

        System.out.println("Digite o saldo da sua conta: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + conta.getCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        scanner.close();
    }
}
