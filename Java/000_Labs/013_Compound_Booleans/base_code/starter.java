/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Pleaase enter one of the secret codes");
		Scanner sc = new Scanner(System.in);
		String bario = sc.nextLine();
		if(bario.equals("kart")){
			System.out.println("mario kart 8 deluxe is peak");
		}else if(bario.equals("freddy")|| bario.equals("foxy")){
			System.out.println("fredy farbear hurhurhurhur");
		}
	}
}
