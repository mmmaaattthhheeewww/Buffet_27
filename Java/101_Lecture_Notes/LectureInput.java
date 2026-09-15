/*
    Lecture note example - Input!!
*/
import java.util.Scanner
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        System.out.println("Welcome to Matts dine and dash");
        System.out.println("Heres our menu:");
        double pizza = (6.90);
        double hamburber = (7.10);
        int cocacola = (3);
        System.out.println("1. hamburber - $" + hamburber);
        System.out.println("2. pizza - $" + pizza);
        System.out.println("3. cocacola - $" + cocacola);
        

        System.out.println(" How many hamburbers would you like:");
        Scanner sc = new Scanner(System.in);
        int item1Quant = sc.nextInt();
        System.out.println("Item 1 Price is:" hamburber*item1Quant)
	}
}
