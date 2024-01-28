import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter Your name");
            String name = Sc.next();
            System.out.println("Enter the two numbers");
            int num1 = Sc.nextInt();
            int num2 = Sc.nextInt();
            int num3 = num1 + num2;
            System.out.println("Enter Character");
            char nam = Sc.next().charAt(0);
            System.out.println(nam);
            System.out.println(name);
            System.out.println(num3);
        }
    }
}
