
import java.util.Scanner;

class  MinNum{

	public static void main(String [] args) {
		int num1, num2, num3;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		num1 = input.nextInt();
		System.out.print("Enter number2: ");
		num2 = input.nextInt();
		System.out.print("Enter number3: ");
		num3 = input.nextInt();
		
		if (num1 < num2 && num1 < num3)
			System.out.println(num1 + " is greater among them.");
		else if (num2 < num1 && num2 < num3)
			System.out.println(num2 + " is greater among them.");
		else
			System.out.println(num3 + " is greater among them.");
				
	}

}