package DataStructures.Arrays.problems;

import java.util.Scanner;

public class ArrayProblems {
    static Scanner sc = new Scanner(System.in);

    static void Swap(int a, int b) {
        // int temp;
        System.out.println("Original values are " + a + " and " + b);
        // temp = a;
        // a = b;
        // b = temp;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped values are " + a + " and " + b);

    }

   

    static void ReverseArray(int[] arr) {
       int i= 0, j=arr.length-1;
       while(i<j){
        SwapInArray(arr, i, j);
        i++;
        j--;
       }
    }

    static int[] RotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
         for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;

    }
     static void SwapInArray(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    static void Reverse(int[] arr, int i, int j){
             while(i < j){
                SwapInArray(arr, i, j);
                i++;
                j--;
             }

    }

    static void RotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n-k-1);
        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        // System.out.println("Enter tha two values");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
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
        System.out.println("Enter the k ");
        int k = sc.nextInt();
        System.out.println("Array after rotation ");
        RotateInPlace(arr, k);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
