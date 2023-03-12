package homeworkweek6;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Program14 {


    public static void myMethod(double w, double h) {

        double perimeter = 2 * (w + h);
        double area = w * h;
        System.out.println("Perimeter of rectangle  is: " + perimeter);
        System.out.println("Area of rectangle  is: " + area);

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the width of the Rectangle:");
        double w = s.nextDouble();
        System.out.println("Enter the height of the Rectangle:");
        double h = s.nextDouble();
        myMethod(w, h);
        s.close();
    }
}