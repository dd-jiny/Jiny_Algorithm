package chap02;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if (x >0 && y>0) {
			System.out.println("1");
		} else if( x > 0 && y<0) {
			System.out.println("4");
		} else if (x <0 && y > 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}

	}

}
