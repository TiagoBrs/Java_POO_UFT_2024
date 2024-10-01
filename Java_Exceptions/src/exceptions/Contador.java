package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try 
		{
			int valor1 = input.nextInt();
			int valor2 = input.nextInt();
			
			if(valor1 > valor2) {
				throw new SecondParamException();
			}
			
			input.close();
			loop(valor1, valor2);
		}
		
		catch(SecondParamException E) 
		{
			System.err.printf("%nErro do tipo %s%n", E);
			System.out.println("O segundo valor deve ser maior que o primeiro.\n");
		}
		catch(InputMismatchException E) 
		{
			System.err.printf("%nErro do tipo: %s%n", E);
			System.out.println("Digite apenas valores inteiros");
			
		}
		
	
	}
	
	private static void loop(int start, int end) 
	{
		int len = end - start;
		if(start == 1) len++;
		
		for(int i = start == 0 ? 0:1; i<= len; i++) 
		{
			System.out.println("Imprimindo o número "+i);
		}
	}
}
