/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("hello zir velcom to le ascii musmuem please slect an opion");
		System.out.println("1. planes");
		System.out.println("2. cars");
		System.out.println("3. trains");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		

		if(a.equals ("plane")){
			System.out.println("please selecet a plane");
			System.out.println("1. dc-6");
			System.out.println("2. generic plane");
			String aa = sc.nextLine();
			if(aa .equals( "dc-6")){
			System.out.println("       __|__");
			System.out.print("--@--@--(_)--@--@--");
			}
			if(aa. equals("generic plane")){
			System.out.println("       __|__");
			System.out.println("--------(_)--------");
			System.out.print("  O  O       O  O");
			}
		}else if(a .equals("car")){
			System.out.println("please select a car");
			System.out.println("1. Studebaker");
			System.out.println("2. generic sedan");
			String aa = sc.nextLine();
			if(aa.equals("Studebaker")){
				System.out.println("  	      ______--------___");
				System.out.println("             /|             / |");
				System.out.println("    o_________|____________/__|");
				System.out.println(" ]|___     |  |=   ||  =|___  |");
				System.out.println("//    |    |  |____||_////    |");
				System.out.println("|  X  |----------------/|  X  |");
				System.out.println("|____/ 1924 Studebaker  |____/");
			}
			if(aa.equals("generic sedan"))
			System.out.println("        _______");
			System.out.println("       // || ||");
			System.out.println(" _____//__||_||___");
			System.out.println(" )  _          _   | ");
			System.out.println("|_/ |_______/ |____|");
			System.out.println("__|/________|/______");
			
		}else if(a .equals("train")){
			System.out.println("select a train");
			System.out.println("1. small locomotive");
			System.out.println("2. small steam engine");
			String aa = sc.nextLine();
			if(aa.equals("small locomotive")){
				System.out.println("____");
				System.out.println("|DD|____T_");
				System.out.println("|_ |_____|<");
				System.out.println("  @-@-@-oo/");
			}if(aa.equals("small steam engine")){
				
				System.out.println("      ___");
				System.out.println("  _][__| |");
				System.out.println(" <_______|-1");
				System.out.println("  O-O-O");
			}
	}
	}
}
