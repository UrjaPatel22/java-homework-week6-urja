package homeworkweek6;

import java.util.Scanner;

/*
12.Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Program12 {
    public static void myMethod(double f, double g, double h, double i, double j, double k) {
        double number1 = ((f * g - h * i) / (j - k));
        System.out.println("Expected Output: " + number1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        double f = s.nextDouble();
        System.out.println("Enter the number");
        double g = s.nextDouble();
        System.out.println("Enter the number");
        double h = s.nextDouble();
        System.out.println("Enter the number");
        double i = s.nextDouble();
        System.out.println("Enter the number");
        double j = s.nextDouble();
        System.out.println("Enter the number");
        double k = s.nextDouble();
        myMethod(f, g, h, i, j, k);
        s.close();
    }
}