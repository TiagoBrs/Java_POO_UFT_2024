import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor1 = input.nextInt();
		int valor2 = input.nextInt();
		//System.out.println("O segundo parâmetro deve ser maior que o primeiro"); Lançar exceção
		
	
	}
	
	private static void loop(int start, int end) 
	{
		for(int i=1; i<= (end-start); i++) 
		{
			System.out.println("Imprimindo o número "+i);
		}
	}

}
