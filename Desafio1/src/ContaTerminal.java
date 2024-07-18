import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Informe o numero da conta: ");
        int numero = sc1.nextInt();
        
        sc1.nextLine();
        System.out.println("Informe o número da agência: ");
        String agencia = sc1.nextLine();
        
        System.out.println("Informe o seu nome:");
        String nomeCliente = sc1.nextLine();   
        
        System.out.println("Informe seu saldo:");
        double saldo = sc1.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
