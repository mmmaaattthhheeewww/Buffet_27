/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        int r = (int)Math.random()*256;
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        getColor(r,g,b);
        int s = (int)(Math.random()*256);
        int c = (int)(Math.random()*256);
        int p = (int)(Math.random()*256);
	s = 255-r;
        c = 255-g;
        p = 255-b; 
        getColor(s,c,p);
        System.out.println("ahcksahbc");
        getColor(r,g,b);
        getColor(b,r,g);
        getColor(g,b,r);
        System.out.println("Darf folor");
        int f = (int)Math.random()*128;
        int e = (int)Math.random()*128;
        int t = (int)Math.random()*128;
        getColor(f,e,t);
        System.out.println("light folor");
        int h = (int)Math.random()*128+128;
        int a = (int)Math.random()*128+128;
        int l = (int)Math.random()*128+128;
        getColor(h,a,l);
        getColor(0,0,255);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
