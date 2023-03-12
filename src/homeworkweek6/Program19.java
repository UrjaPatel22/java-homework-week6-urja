package homeworkweek6;

import java.util.Scanner;

/*
19. Write a Java program to convert a given string into lowercase.
        Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {


    public static void myMethod(String a){
        String n = a.toUpperCase();
        System.out.println("convert the lower case to upper case: "  + n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = s.nextLine();
        myMethod(a);
        s.close();
    }
    }
