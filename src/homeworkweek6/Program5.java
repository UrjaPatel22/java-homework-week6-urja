package homeworkweek6;

/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {
    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition is : " + ans);
    }

    public void substraction(int a, int b) {
        int ans1 = a - b;
        System.out.println("Substraction is : " + ans1);
    }

    public static void multiplication(int a, int b) {
        int ans2 = a * b;
        System.out.println("Multiplication is : " + ans2);
    }

    public static void division(int a, int b) {
        int ans3 = a / b;
        System.out.println("Division is : " + ans3);
    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.addition(10, 20);
        obj.substraction(20, 10);
        multiplication(2, 3);
        division(10, 2);

    }
}