import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeUsuario = userInput.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroDaAgencia = userInput.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numeroDaConta = userInput.nextInt();

        System.out.print("Por favor, digite o seu saldo: ");
        double saldoDaConta = userInput.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s ja esta disponivel para saque", nomeUsuario, numeroDaAgencia, numeroDaConta, saldoDaConta);

    }
}
