/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("whadisyourname");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("whatisurtitle");
		String title = sc.nextLine();
		System.out.println("woudl u liek to be  a Bloxxer, a pwner, or a NOOB");
		String roller = sc.nextLine();
			if(roller.equals("Bloxxer")){
				System.out.println("you are a tuff bloxxer liek ME");
			}else if(roller.equals("Pwner")){
				System.out.println("you are a tuffinion pwner");
			}else if(roller.equals("NOOB")){
				System.out.println("you are loser NOOB");
			}else{
				System.out.println("rerun the program");
			}
			System.out.println("put ur stats in u ahve 40 points");
			System.out.println("how much strength 1-10");
			int statpoints = sc.nextInt();
			System.out.println("How much indellengince 1-10");
			int tatpoints = sc.nextInt();
			System.out.println("how much desterity 1-10");
			int atpoints = sc.nextInt();
			System.out.println("How much speed 1-10");
			int tpoints = sc.nextInt();
			System.out.println("your stats are as followed: " + statpoints + " " + tatpoints +" " + atpoints + " " + tpoints + " ");
			if(statpoints > 10){
				System.out.println("too much lil bro");
			}
			if(tatpoints > 10){
				System.out.println("too much lil bro");
			}
			if(atpoints > 10){
				System.out.println("too much lil bro");
			}
			if(tpoints > 10){
				System.out.println("too much lil bro");
			}
			if(statpoints < 1){
				System.out.println("too little lil bro");
			}
			if(tatpoints < 1){
				System.out.println("too little lil bro");
			}
			if(atpoints < 1){
				System.out.println("too little lil bro");
			}
			if(tpoints < 1){
				System.out.println("too little lil bro");
			}
	}
}
