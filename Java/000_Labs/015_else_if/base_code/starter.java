/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 System.out.println("pick a number 1-100");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = (int)(Math.random()*100)+1;

		if(a > m){
			System.out.println("your number is bigger than "+ m);
		}
		else if(a < m){
			System.out.println("your nunber was smaller than "+ m);
		}
	}
}
