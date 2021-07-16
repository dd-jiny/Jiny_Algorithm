package chap03;

public class practice04 {

	public static void main(String[] args) {
		
		/* 
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3 
		 * 1 2
		 * 1
		 */
		
		for (int i = 1; i <=6 ; i++) {
			
			for(int j = 1; j<=6-i ; j++) {
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}
		
		/*
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        */
		
		/*
		for (int i = 5; i > 0; i--) {
            int cnt = 1;
            for (int j = 0; j < i; j++) {
                arr[j] = cnt;
                cnt++;
                System.out.print(arr[j]);
            }
            System.out.println();
        }
        */

	}

}
