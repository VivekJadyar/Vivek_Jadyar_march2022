
class P12 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			for (int space = 5 - rows; space >= 1; space--){
				
				System.out.print(" ");
				
			}
			
			for (int column = 1; column <= rows; column++){
				
				System.out.print(rows + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}