/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		System.out.println("Please enter your first number: ");
		Scanner sc = new Scanner(System.in);
		int firstnum = sc.nextInt();
		System.out.println("Please enter your first number: ");
		int secondnum = sc.nextInt();
		if(firstnum != secondnum){
			System.out.println("Your numbers are different.");
		}
		if(firstnum == secondnum){
			System.out.println("your numbers are the same.");
		}
	}
}
