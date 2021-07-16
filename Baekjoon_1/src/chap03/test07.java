package chap03;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		
		for (int i = 1; i <= t; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
				
			System.out.println("Case #" + i+":"+ (a + b));
		}

	}

}
