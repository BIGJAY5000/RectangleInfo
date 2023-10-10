import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double length = 0;
        double width = 0;
        boolean done1 = false;
        boolean done2 = false;

        do {
            System.out.println("Please enter the length of your rectangle here");
            if (scan.hasNextDouble()) {
                length = scan.nextDouble();
                scan.nextLine();
                if (length <= 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (length > 0) {
                    done1 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }
        } while (!done1);
        do {
            System.out.println("Please enter the width of your rectangle here");
            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                scan.nextLine();
                if (width <= 0) {
                    System.out.println("You have entered an invalid value, Please try again");
                }
                if (width > 0) {
                    done2 = true;
                }
            }
            else {
                System.out.println("You have entered an invalid value, Please try again");
                scan.nextLine();
            }
        } while (!done2);
        System.out.printf("\n %-14s%5.2f", "Length:", length);
        System.out.printf("\n %-14s%5.2f", "Width:", width);
        System.out.printf("\n %-14s%5.2f", "Area:", length * width);
        System.out.printf("\n %-14s%5.2f", "Perimeter:", 2*length + 2*width);
        System.out.printf("\n %-14s%5.2f", "Diagonal:", Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));



    }
}
