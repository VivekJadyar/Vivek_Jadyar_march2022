
import java.util.Scanner;

class  AddLogGate{

	public static void main(String [] args) {
		int a, b; 

		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter num1: ");
		a = input.nextInt();
		
		System.out.print("Enter num2: ");
		b = input.nextInt();
		
        while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        
		System.out.println("Addition is " + a);
	}
	
}	

