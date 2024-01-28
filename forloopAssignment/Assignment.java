package forloopAssignment;

public class Assignment {

    public static void fibonacciSeries(int n){
        int ans = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
            ans += sum;
            System.out.println(ans);
        }
        
    }
    public static void main(String[] args){
        fibonacciSeries(6);
    }
}
