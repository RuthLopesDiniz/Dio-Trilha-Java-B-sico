import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

	public static void main(String[] args) throws Exception{
		//TODO: Conhecer e importar a classe Scanner.
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//Exibir as mensagens para o nosso usuário.
		//Obter pela scanner os valores digitados no terminal.
		System.out.println("Por favor, digite o seu nome!");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o número da Agência! ");
		String numeroAgencia = scanner.next();
		
		System.out.println("Por favor, digite o número da sua conta! ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Por favor, digite seu saldo! ");
		double saldo = scanner.nextDouble();
		
		//Exibir a mensagem conta criada.
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "
				+ numeroAgencia + ", conta: " + numeroConta + " e seu saldo: " + saldo + 
				" já está disponível para saque.");
	}

}
