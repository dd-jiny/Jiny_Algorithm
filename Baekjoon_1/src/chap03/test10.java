package chap03;

import java.util.Scanner;

public class test10 {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			int N = scn.nextInt();
			
			for( int i = 1; i <= N; i++) {
				for (int j=1; j <= N-i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		
	}
}
