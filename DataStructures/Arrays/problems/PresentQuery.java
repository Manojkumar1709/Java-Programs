package DataStructures.Arrays.problems;

import java.util.Scanner;

public class PresentQuery {
    static Scanner sc = new Scanner(System.in);

    static int[] MakeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Original array is");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int[] freq = MakeFrequencyArray(arr);
        System.out.println("Enter the queries ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter Number to be searched");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
        System.out.println("Array after rotation ");
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
