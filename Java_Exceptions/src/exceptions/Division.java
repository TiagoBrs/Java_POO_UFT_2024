package exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {
	
	public static int division(int a, int b)  throws ArithmeticException{
		return a / b;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		
		do 
		{
			try	
			{
				
				int a = input.nextInt();
				int b = input.nextInt();
			
				int q = division(a, b);
				
				System.out.println(a+" : "+b + " = "+q);
				input.close();
				continueLoop = false;
			}
			catch(InputMismatchException invalid_input) 
			{
				System.err.printf("\nException: %s\n", invalid_input);
				input.nextLine();
				System.out.println("Invalid input, try again");
			}
			catch(ArithmeticException math_error) 
			{
				System.err.printf("\nException: %s\n", math_error);
				System.out.println("Zero is a invalid denominator. Try again");
			}
		}while(continueLoop);
		
	}

}
