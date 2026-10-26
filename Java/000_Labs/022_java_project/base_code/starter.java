/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to le slot machine");
		System.out.println("rule 1 u start with 100 smackaroos");
		System.out.println("rule 2 cant wages more than u have");
		System.out.println("rule 3 the slot machine will rolle 3 numbers from 0 to 7");
		System.out.println("If 2 numbers match u double ur mula");
		System.out.println("if 3 numers match u triple ur mula");
		System.out.println("If no numars match u luse ur betted mula");
		System.out.println("wager?");
		String ice = sc.nextLine();
		if(ice.equals("Yes")||ice.equals("yes")||ice.equals("y")||ice.equals("Y")){
			System.out.println("Howmuchuwager");
		}
		
		int wagered = sc.nextInt();
		int total = 100;
		while(total != 0){
			int x = (int)(Math.random()*7);
			int y = (int)(Math.random()*7);
			int z = (int)(Math.random()*7);
				if(total == 0){
					System.out.println("heh u ran out of money better luck next time sucka");
					break;
				}
			System.out.println(x + " " + y + " " + z);
			System.out.println("would u like to wager again?");
			ice = sc.nextLine();
			if(ice.equals("Yes")||ice.equals("yes")||ice.equals("y")||ice.equals("Y")){
			System.out.println("Howmuchuwager");
			}
		}
		
	}
}
