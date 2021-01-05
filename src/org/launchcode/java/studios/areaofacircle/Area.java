package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        if (input.hasNextDouble()) {
            double radiusOfCircle = input.nextDouble();
            input.close();
            if (radiusOfCircle > 0) {
                double areaOfCircle = Circle.getArea(radiusOfCircle); // 3.14 * radiusOfCircle * radiusOfCircle;
                System.out.println("The area of the circle is: " + areaOfCircle);
            } else {
                System.out.println("-Invalid entry-");
            }
        } else {
            System.out.println("Invalid entry");
        }

    }
}
