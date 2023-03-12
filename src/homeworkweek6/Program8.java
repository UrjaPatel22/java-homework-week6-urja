package homeworkweek6;

/*
8. Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Program8 {

    public static void myMethod(double b, double h) {

        double area = b * h / 2;
        System.out.println("Area of Triangle is: " + area);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double b = s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double h = s.nextDouble();
        myMethod(b, h);
        s.close();
    }

}
