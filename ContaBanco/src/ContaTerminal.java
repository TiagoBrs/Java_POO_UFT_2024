import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		int Numero;
		String Agencia;
		String NomeCliente;
		double Saldo;
		
		System.out.print("Por favor, digite o número da Agência: ");
		Numero = input.nextInt();
		input.nextLine();
		
		System.out.print("Por favor, digite a agência: ");
		Agencia = input.nextLine();

		System.out.print("Por favor, digite o seu nome: ");
		NomeCliente = input.nextLine();
		
		System.out.print("Digite o saldo inicial: ");
		Saldo = input.nextDouble();
		
		System.out.printf("%nOlá, "+NomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está dosponível para saque.");
		
			
	}
}
