import java.util.Scanner;
import java.util.Locale;

public class InvoiceAPP
{
	public static void main(String[] args) 
	{
		Invoice My_Invoice = new Invoice(); 
		Scanner input = new Scanner(System.in).useLocale(Locale.US); 
		Scanner input_2 = new Scanner(System.in).useLocale(Locale.US); 

		System.out.println(input == input_2);

		String identification, description;
		double cost;
		int units;

		System.out.print("Número de identificação do produto: ");
		identification = input.nextLine();
		My_Invoice.setIdentificationNumber(identification);

		System.out.print("Descrição da fatura: ");
		description = input.nextLine();
		My_Invoice.setDescription(description);

		System.out.print("Unidades vendidas: ");
		units = input.nextInt();
		My_Invoice.setSoldUnits(units);

		System.out.print("Preço: ");
		cost = input.nextDouble();
		My_Invoice.setCost(cost);

		System.out.printf("Mostrando valor da fatura do produto %s%n", My_Invoice.getIdentificationNumber());
		System.out.printf("%.2f%n", My_Invoice.getInvoiceAmount());

		input.close();
	}

}