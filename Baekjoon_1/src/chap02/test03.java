package chap02;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int Year = scn.nextInt();
		
		if (Year%4 == 0 && (!(Year%100 == 0) || (Year%400==0) )) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
