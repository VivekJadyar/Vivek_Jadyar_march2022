
import java.util.Scanner;

class  RevNum{

	public static void main(String [] args) {
		int num, rev = 0, digit;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		num = input.nextInt();

		
		while (num != 0) {
			digit = num % 10;
			rev *= 10;
			rev = rev + digit;
			num /= 10;
		}
		
		System.out.print("Reverse number is: " + rev);
				
	}

}