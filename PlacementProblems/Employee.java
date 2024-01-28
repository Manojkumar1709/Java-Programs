import java.util.Scanner;

public class Employee {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your name and phone number");
        String name = sc.next();
        String number = sc.next();
        if (!((name.length() < 4) && (number.length() < 10))) {
            String empid = name.substring(0, 4) + number.substring(6, 10);
            System.out.println(empid);
        }
    }
}
