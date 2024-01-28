package DataStructures.Arrays.problems;


import java.util.*;

public class CopyArray {
    static Scanner sc = new Scanner(System.in);

    static void inputArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Initialize the array with size n

        System.out.println("Enter the elements of the array:");
        inputArray(arr);

        System.out.println("Before Changing the values in Array_2 ");

        System.out.println("original Array Elements: ");
        printArray(arr);
        System.out.println();

        int arr_2[]; 
        arr_2 = arr;
        System.out.println("Copied Array Elements: ");
        printArray(arr_2);
        System.out.println();

        System.out.println("After Changing the values in Array_2 ");
        arr_2[0] = 0;
        arr_2[1] = 0;
        arr_2[2] = 0;
        System.out.println("original Array Elements: ");
        printArray(arr);
        System.out.println();
        System.out.println("Copied Array Elements: ");
        printArray(arr_2);
    }
}
