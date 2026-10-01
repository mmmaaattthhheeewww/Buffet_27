/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("enter a numbar between 1 and 100");
		
		int randomnum2 = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a==randomnum2){
			System.out.println("CORRECT HERES YOUR PRIZE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		else{
			System.out.println("incorrect now i gib u subspace tripmine >:D");
		}
	}
}
