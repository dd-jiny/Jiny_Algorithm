package chap03;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();
		
		int a;
		int b;
		
		for ( int i = 0 ; i < t ; i++) {  //question int i = 1, i == t 왜 안될까
						
			a = scn.nextInt();
			b = scn.nextInt();
			
			System.out.println(a+b);
			
		}
			
		}

	}


