import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num ;i++){
            if(i % 2 == 0){
                sum -= i;
            }
            else{
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
