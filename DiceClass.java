import java.security.SecureRandom;
import java.util.Locale;

public class DiceClass
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);

		SecureRandom randomNumber = new SecureRandom();

		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		int face;

		int n = 10_000_000;

		for(int i=1; i<=n; i++)
		{
			face = 1 + randomNumber.nextInt(6);

			switch (face)
			{
				case 1:
					frequency1++;
					break;

				case 2:
					frequency2++;
					break;

				case 3:
					frequency3++;
					break;

				case 4:
					frequency4++;
					break;

				case 5:
					frequency5++;
					break;

				case 6:
					frequency6++;
					break;			
			}
		}

		System.out.println("Face/tFrequência");
		System.out.printf("1\t%f%n2\t%f%n3\t%f%n4\t%f%n5\t%f%n6\t%f%n", 
		(double) frequency1/n, (double) frequency2/n, (double) frequency3/n, 
		(double) frequency4/n, (double) frequency5/n, (double) frequency6/n);

	
	}
}