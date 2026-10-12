/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("choose 2 variables");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("first variable " + num1);
		System.out.println("first variable " + num2);
		if (num1 == num2){
			System.out.println("your 2 numbers are the same");
		}
		if(num1 != num2){
			System.out.println("your numbers are differnet");
		}
	}
}
