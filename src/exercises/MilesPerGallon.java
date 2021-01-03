package exercises;

import java.util.Scanner;


public class MilesPerGallon {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        int milesDriven = input.nextInt();
        System.out.println("Enter amount of gas consumed:");
        int gasUsed = input.nextInt();
        input.close();
        int milesPerGallon = milesDriven / gasUsed;
        System.out.println("Your miles per gallon is " + milesPerGallon);
    }
}
