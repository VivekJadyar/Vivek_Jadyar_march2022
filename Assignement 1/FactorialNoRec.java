import java.util.Scanner;

class FactorialNoRec {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		int fact;
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		fact = number;
		
		while (number != 1) {
			fact *= (number - 1);
			number--;		
		}
		
		System.out.println("Factorial of given number is " + fact);
		
	}

}

