/*
(Classe Invoice ) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a 
utilize para representar uma fatura de um item vendido nela. Uma Invoice (fatura) deve incluir 
quatro partes das informações 
como variáveis de instância — o número (tipo String ), a descrição (tipo String ), a quantidade 
comprada de um item (tipo int ) e o preço por item ( double ). Sua classe deve ter um construtor que 
inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de 
instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura 
(isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor como double.Se a 
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, 
ele deve ser configurado como 0.0 . Escreva um aplicativo de teste chamado InvoiceTest que 
demonstra as capacidades da classe Invoice .
*/



public class Invoice
{
	private String identification_number, description;
	private int sold_units;
	private double cost;
	private static int a;
	
	public Invoice(String identification_number)
	{
		this.identification_number = identification_number;
		description = "Descrição não anexada";
		sold_units = 0;
		cost = 0.0;
	}

	public Invoice() //Outro construtor caso o número de identificação não for especificado
	{	
		identification_number = "identificação não adicionada";
		description = "descrição não anexada";
		sold_units = 0;
		cost = 0.0;
	}  

	public void setIdentificationNumber(String name)
	{
		identification_number = name;
	}

	public String getIdentificationNumber()
	{
		return identification_number;
	}

	public void setDescription(String name)
	{
		description = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setSoldUnits(int sold_units)
	{
		this.sold_units = sold_units;
	}

	public int getSoldUnits()
	{
		return sold_units;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getCost()
	{
		return cost;
	}

	public double getInvoiceAmount()
	{
		return cost*sold_units;
	}

}