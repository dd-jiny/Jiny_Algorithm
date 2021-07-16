package chap01;

import java.util.Scanner;

public class test11 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		
		
		System.out.println(a*((b%100)%10));
		System.out.println((a*((b%100)-((b%100)%10))/10));
		System.out.println((a*(b-(b%100))/100));
		System.out.println(a*b);
		
	}
		
}
