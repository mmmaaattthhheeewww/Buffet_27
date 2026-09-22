/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter 2 nombars to create a range from your 2 nunbers");
		
		System.out.print("Enter an integer: ");
		
		Scanner sc = new Scanner(System.in);
		
		int zazulik = sc.nextInt();

		System.out.println("Enter a second number (bigger than first number)");

		int meekmeek = sc.nextInt();

		System.out.println("Your two numbers is " + zazulik + " and " +  meekmeek);

		
		int beegbaak = (int)(Math.random()*(meekmeek-zazulik)+zazulik);
		int lalal = (int)(Math.random()*(meekmeek-zazulik)+zazulik);
		int hotdog = (int)(Math.random()*(meekmeek-zazulik)+zazulik);
		int haho = (int)(Math.random()*(meekmeek-zazulik)+zazulik);
		int blee = (int)(Math.random()*(meekmeek-zazulik)+zazulik);
		System.out.println("here ae 5 numbas in that range");
		
		System.out.println(beegbaak + "," + lalal  + "," + hotdog  + "," + haho + "," + blee);

	}
}
