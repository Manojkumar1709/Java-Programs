package DataStructures.Arrays.assignment;

public class Assignment {
    static void positiveValueArray() {
        int[] arr = { 2, 6, -5, -1, 0, 4, -9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void oddStringIndex() {
        String[] arr = { "ab", "bc", "cd", "de", "ef", "fg", "gh" };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void postiveValues() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i : arr) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    static void minimumNumber() {
        int[] arr = { 2, -3, 5, 8, 1, 0, -4 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

    static void peakValue() {
        int[] arr = { 1, 1, 3, 4, 2, 3, 5, 7, 0 };
        for(int i=1; i<arr.length; i++){
            if((arr[i-1] < arr[i]) && (arr[i] > arr[i+1])){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // positiveValueArray();
        // oddStringIndex();
        // postiveValues();
        // minimumNumber();
        peakValue();
    }
}
