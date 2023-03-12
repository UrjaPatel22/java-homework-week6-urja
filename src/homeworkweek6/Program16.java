package homeworkweek6;

/*
16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */


import java.util.Scanner;

public class Program16 {

    public static void myMethod(int a, int b) {
        int a1 = (int) a;
        int b1 = (int) b;
        String s1 = Integer.toString(a1);
        String s2 = Integer.toString(b1);
        int num0 = Integer.parseInt(s1, 2);
        int num1 = Integer.parseInt(s2, 2);
        int sum = num0 + num1;
        String s3 = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + s3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the First number");
        int a = s.nextInt();
        System.out.println("Input the Second number");
        int  b = s.nextInt();
        myMethod(a,b);
        s.close();
}
}