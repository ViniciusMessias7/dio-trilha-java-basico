import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeUsuario = userInput.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroDaAgencia = userInput.nextLine();

        int numeroDaConta;
        while (true) {
            try {
                System.out.print("Por favor, digite o número da conta: ");
                numeroDaConta = userInput.nextInt();
                break;
            } catch (InputMismatchException e) {
                userInput.next();
                System.out.println("\nIsso não é um número válido! Tente novamente.");
            }
        }

        double saldoDaConta;
        while (true) {
            try {
                System.out.print("Por favor, digite o seu saldo: ");
                saldoDaConta = userInput.nextDouble();
                break;
            } catch (InputMismatchException e) {
                userInput.next();
                System.out.println("\nIsso não é um saldo válido! Tente novamente.");
            }
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s ja esta disponivel para saque", nomeUsuario, numeroDaAgencia, numeroDaConta, saldoDaConta);
        userInput.close();
    }
}
