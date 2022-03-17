import java.util.Scanner;

class DecHexa {			// Decimal to Hexa

	public static void main (String [] args) {
	
		Scanner input = new Scanner(System.in);
		int num, rem;
		String revBin = "";
		String hexa = "";
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		while(num != 0) {
			rem = num % 16;
			
			if (rem < 10) 
				revBin += rem;
			else 
				revBin += (char)(rem + 55);
			
			num = num / 16;					
		}
		
		for (int i = revBin.length() - 1; i >= 0; i--)
			hexa = hexa + revBin.charAt(i);
		
		System.out.println(hexa);
	}

}