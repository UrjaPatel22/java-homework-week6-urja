package homeworkweek6;

/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program6 {

    public static void myMethod(double r){

        double area = (3.14 * r * r);
        System.out.println("Area of Circle is" + area);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = scanner.nextDouble();
        myMethod(r);
        scanner.close();

    }
}
