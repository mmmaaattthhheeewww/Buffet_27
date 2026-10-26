/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("enter a width ");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		System.out.println("enter a hieght ");
		int height = sc.nextInt();
		int jarebem = 0;
		int bardem = 0;
		
		
		while(bardem < height){
			jarebem = 0;
			while(width > jarebem){
			System.out.print("*");
			jarebem++;
				
		}
		System.out.println();
		bardem++;
			
		}
		System.out.println("please enter an number");
		int bint = sc.nextInt();
		int row = 1;
		while(row <= bint){
			int stars = 0;
			while(stars < row){
				System.out.print("*");
				stars++;
			}
			System.out.println();
			row++;
		}
		System.out.println("reversed star");
		System.out.println("enter an integer");
		int size = sc.nextInt();
		row = 1;
		while(row <= size){
			int space = 0;
			while(space < size - row){
				System.out.print(" ");
				space++;
			}
			int star = 0;
			while(star < row){
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
		}

	}
}