package homeworkweek6;

import java.util.Scanner;

/*
Write a program to convert the upper case to lower case.
 */
public class Program9 {

    public static void myMethod(String a){
        String n = a.toLowerCase();
        System.out.println("convert the upper case to lower case: "  + n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = s.nextLine();
        myMethod(a);
        s.close();

    }
}
