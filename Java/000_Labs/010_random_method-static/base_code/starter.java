/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()*9);
		System.out.println("A number between 0-9: "+ x);
		int y = (int)(Math.random()*10)+1;
		System.out.println("A number between 1 - 10: "+ y);
		double z = (Math.random()*3.5);
		System.out.println("a number between 0 and 3.5: "+ z);
		double xyz = (Math.random()*1.5903);
		System.out.println("a double between 0 and 1.5903: " + xyz);
	}
}
