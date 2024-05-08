import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Cadastro do banco");
        System.out.println("Por favor, digite o numero da sua agencia: ");
        int numero = scanner.nextInt(); 

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next(); 

        System.out.println("Digite seu nome: ");
        String nome = scanner.next(); 

        System.out.println("Insira seu saldo: ");
        float saldo = scanner.nextFloat(); 


        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");    
    }
}
