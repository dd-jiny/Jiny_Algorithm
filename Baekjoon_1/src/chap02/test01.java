package chap02;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else if(a == b) {
			System.out.println("==");
		}
	}

}