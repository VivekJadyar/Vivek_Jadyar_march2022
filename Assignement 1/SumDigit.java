
import java.util.Scanner;

class  SumDigit{

	public static void main(String [] args) {
		int num;
		int digit;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num = input.nextInt();
		
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		
		System.out.print("Sum of digits is: " + sum);
		
	}

}