package homeworkweek6;

/*

4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    //instance variable
    int a = 10;
    int b = 20;
    // static variable
    static int c = 50;
    static int d = 10;

    //instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    // static method
    public static void myStatic() {
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        myStatic();
        Program4 obj = new Program4();
        obj.myMethod();
    }
}
