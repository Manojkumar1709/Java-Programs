package DataStructures.Arrays.problems;

import java.util.Scanner;

public class ProblemsArrays {
    static Scanner sc = new Scanner(System.in);

    static int PairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The pairs are " + arr[i] + " " + arr[j]);
                    ans++;
                }
            }
        }
        return ans;
    }

    static int TripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("The pairs are " + arr[i] + " " + arr[j] + " " + arr[k]);
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int FindUnique(int[] arr) {
        int n = arr.length;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int FindMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int SecondMax(int[] arr) {
        int max = FindMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = FindMax(arr);

        return secondMax;
    }

    static int FirstRepeatingNumber(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
         System.out.println("Enter Target sum");
         int target = sc.nextInt();
         int ans = PairSum(arr, target);
        System.out.println("Number of pairs "+ans);

    }
}
