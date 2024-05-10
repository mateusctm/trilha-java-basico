import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência !");
        contaTerminal.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta !");
        contaTerminal.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Por favor, digite o nome de Usuário!");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, valor do saldo!");
        contaTerminal.setSaldo(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque");


    }
}