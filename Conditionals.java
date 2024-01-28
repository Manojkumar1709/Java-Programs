import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        String res = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(res);
    }
}
