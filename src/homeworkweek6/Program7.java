package homeworkweek6;

import java.util.Scanner;

/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {

    public static void myMethod(double f) {
        double c = 5.0 / 9.0 * (f - 32);
        System.out.println("Convert into degree Celsius" + c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Temprature");
        double f = s.nextDouble();
        myMethod(f);
        s.close();
    }
}
