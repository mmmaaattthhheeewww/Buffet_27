/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("would like to be a runner, a charger, or a bart");
			Scanner sc = new Scanner(System.in);
			String  category = sc.nextLine();
			if(category.equals("runner")){
				System.out.println("You are a runner");
			}else if(category.equals("charger")){
				System.out.println("your a dodge charger");
			}else if(category.equals("bart")){
				System.out.println("your a bart simpson");
			}else{
				System.out.println("thats not a class on this roster now is it innit?");
			}
	}
}
