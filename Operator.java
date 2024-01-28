import java.util.*;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four operator");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1==num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1!=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println((num1>num2) && (num3>num4));
        System.out.println((num1>num2) || (num3<num4));
        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(!(num1==num2));
        System.out.println(num1+=num2);
        System.out.println(num1-=num2);
        System.out.println(num1*=num2);
        System.out.println(num1/=num2);
        System.out.println(num1%=num2);
        int y = num1++;
        int x = num2--;
        System.out.println(y);
        System.out.println(x);
        int w = ++num1;
        int u = --num2;
        System.out.println(w);
        System.out.println(u);
        System.out.println(4+2+"pqr");
        System.out.println("pqr"+4+2);
        System.out.println(num1^num2);
        System.out.println(num1<<1);
        System.out.println(num1>>1);
    }
}
