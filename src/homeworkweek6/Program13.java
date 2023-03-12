package homeworkweek6;

/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
import java.util.Scanner;

public class Program13 {

    public static void myMethod(double f, double g, double h) {
        double number1 = (f + g + h)/3;
        System.out.println("Expected Output: " + number1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the First number");
        double f = s.nextDouble();
        System.out.println("Input the Second number");
        double g = s.nextDouble();
        System.out.println("Input the Third number");
        double h = s.nextDouble();
        myMethod(f, g, h);
        s.close();
    }
}
