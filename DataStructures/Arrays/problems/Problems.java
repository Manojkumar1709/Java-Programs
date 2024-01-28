package DataStructures.Arrays.problems;

import java.util.Arrays;

public class Problems {

    static void TwoDimensionalArray(){
        int [] [] num = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                System.out.println("Array value in index "+i+" "+j+" is "+num[i][j]);
            }
        }
    }

    static void SumOfArray(){
        int[] arr = {1,5,3};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static void SearchInArray(){
        int arr[] = { 2, 3, 5, 1, 9, 5 };
        int x = 5;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found the " + x + " in the index " + ans);
        }
    }

    static void MaximumOfArray(){
        int [] arr = {10,2,4,6,3,9};
        int ans = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    static void CountElements(){
        int x = 5;
        int arr[] = {5,6,5,1,5,3,2,1,5};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }

    static void LastOccurrence(){
        int x = 5;
        int arr[] = {5,6,5,1,5,3,2,1};
        int last_index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                last_index = i;
            }
        }
        System.out.println("Last Index of "+x+" is "+last_index);
    }

    static void ElementStrictlyGreater(){
        int x = 5;
        int arr[] = {5,6,1,3,2,1,7,8,10};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("The Array contains "+count+" numbers greater than "+x);
    }

    static void SortedArray(){
         int arr[] = {1,2,3,4,2};
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
       System.out.println(check);
    }

    static int[] SmallestAndLargestElement(){
        int arr[] = {2,3,1,4,7,5};
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
       int ans[] =  SmallestAndLargestElement();
       System.out.println("The smallest element is "+ans[0]);
        System.out.println("The Largest element is "+ans[1]);
    }
}
