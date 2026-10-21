/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("welcome to guessing game");
		System.out.println("guess a number");
		int y = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x != y){
		if(x == y){
			System.out.println("correct");
		}else if(x > y){
			System.out.println("lower");
		}else if(x < y){
			System.out.println("higher");
		}if(x != y){
			System.out.println("guess a number again");
			x = sc.nextInt();
		}


		}



		
	}

}
