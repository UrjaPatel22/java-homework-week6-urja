package homeworkweek6;
/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class Program18 {

    public static void myMethod(int f, int g) {
        int  number1 = f + g;
        int  number2 = f - g;
        int  number3 = f * g;
        int  number4 = f / g;
        int  number5 = f % g;
        System.out.println("Expected Output a+b : " + number1);
        System.out.println("Expected Output a-b : " + number2);
        System.out.println("Expected Output a*b : " + number3);
        System.out.println("Expected Output a/b : " + number4);
        System.out.println("Expected Output a%b : " + number5);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input  the first number");
        int f = s.nextInt();
        System.out.println("Input the Second number");
        int g = s.nextInt();
        myMethod(f, g);
        s.close();
    }
}
