import java.util.*;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number Start and end ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        float avg = 0f;
        int count = 0;

        for (int num = start; num <= end; num += 2) {
            System.out.println(num);
            sum = sum + num;
            count++;
            if (num == 8)
                break;
        }
        avg = sum / count;
        System.out.println(avg);
        System.out.println(sum);

         int num =1;
         while(true){
             if((num % 5==0) && (num % 7 ==0)){
                 System.out.println("Found ans" + num);
                 break;
             }
             num++;
         }

      
         for(int cont= 1; cont<=50; cont++ ){
             if(cont % 3 == 0){
                 continue;
             }
             System.out.println(cont);
         }

        int cont =1;
       whileloop : while(cont <= 50){
            if(cont % 3 == 0){
                cont++;
                continue;
            }
            System.out.println(cont);
                cont++;
        }


    }
}