import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo = 10.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, por favor, informe o número da sua conta: ");
        Numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o número da sua agência: ");
        Agencia = scanner.nextLine();
        System.out.println("Informe o seu nome: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é: " + Agencia + ", e a conta é: " + Numero + 
                           " e o seu saldo de R$ " + Saldo + " já está disponível para saque.");

                           scanner.close();
    }
}
