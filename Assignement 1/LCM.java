
import java.util.Scanner;

class  LCM{

	public static void main(String [] args) {
		int n1, n2, max;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		n1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		n2 = input.nextInt();
		
		max = (n1 > n2) ? n1 : n2;
		
		while (true) {
			if (max % n1 == 0 && max % n2 == 0) {
				System.out.println("The LCM of " + n1 + " and " + n2 + " is " + max);
				break;
			}
        ++max;
		}
			
	}

}
		

