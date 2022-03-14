
import java.util.Scanner;

class ConBinInt {       // Binary to Integer conversion

	public static void main(String args []) {

		int digit, intNum = 0, i = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the binary number: ");
		int num = input.nextInt();
		
		while (num != 0) {
			digit = num % 10;
			intNum = (int)(intNum + (digit * Math.pow(2, i)));
			i++;
			num = num / 10;
		}
		
		System.out.println("Integer number is: " + intNum);
	
	}

}