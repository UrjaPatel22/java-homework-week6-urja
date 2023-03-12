package homeworkweek6;

import java.util.Scanner;

/*
15. Write a Java program to swap two variables.
 */
public class Program15 {


public static void myMethod(int x, int y){
    int temp = x;
    x = y;
    y = temp;
    System.out.println(" After Swap Numbers: "   + x);
    System.out.println(" After Swap Numbers: "   + y);
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input  the first number");
        int x = s.nextInt();
        System.out.println("Input the Second number");
        int y = s.nextInt();
        myMethod(x, y);
        s.close();

    }
}
