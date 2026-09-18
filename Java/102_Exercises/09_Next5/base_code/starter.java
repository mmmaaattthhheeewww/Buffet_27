/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("Please enter a number:");
		Scanner sc = new Scanner(System.in);
		int numberafter = sc.nextInt();
		System.out.println("Here are the next 5 numbers:");
		System.out.print(numberafter + 1);
		System.out.print(",");
		System.out.print(numberafter + 2);
		System.out.print(",");
		System.out.print(numberafter + 3);
		System.out.print(",");
		System.out.print(numberafter + 4);
		System.out.print(",");
		System.out.println(numberafter + 5);
		System.out.println("Here are the next 5 multiples: ");
		System.out.print(numberafter*1);
		System.out.print(",");
		System.out.print(numberafter*2);
		System.out.print(",");
		System.out.print(numberafter*3);
		System.out.print(",");
		System.out.print(numberafter*4);
		System.out.print(",");
		System.out.println(numberafter*5);
		System.out.println("Here is " + numberafter + " divided by 100");
		System.out.println(numberafter / 100.0);
		System.out.println ("Here is " + numberafter + " divided by 10");
		System.out.println(numberafter / 10.0);
	}
}