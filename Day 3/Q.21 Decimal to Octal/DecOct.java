import java.util.Scanner;

class DecOct {			// Decimal to Octal conversion

	public static void main (String [] args) {
	
		Scanner input = new Scanner(System.in);
		int num, rem;
		String revBin = "";
		String oct = "";
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		while(num != 0) {
			rem = num % 8;
			
				revBin += Integer.toString(rem);
			
			num = num / 8;					
		}
		
		for (int i = revBin.length() - 1; i >= 0; i--)
			oct = oct + revBin.charAt(i);
		
		System.out.println(oct);
	}

}