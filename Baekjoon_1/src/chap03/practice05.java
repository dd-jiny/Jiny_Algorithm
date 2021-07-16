package chap03;

public class practice05 {

	public static void main(String[] args) {
		
		
		/*
		 1 2 3 4 5
		   1 2 3 4
		     1 2 3
		       1 2
		         1
		*/
		

		/*
		 *          1
		 *        1 2
		 *      1 2 3
		 *    1 2 3 4
		 *  1 2 3 4 5
		 */
		
		
		/*
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 5-i; k++) {
				System.out.print(k);
			}
			System.out.println();
				
		}
	*/
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i ; j--) {
				System.out.print(" ");
			} 
			for (int k = 1 ; k <= i ; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
