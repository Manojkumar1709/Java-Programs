public class First {
  public static boolean isPresent(int[] array, int number) {
    // Create a boolean array to store the presence of each number in the array
    boolean[] present = new boolean[100000];

    // Initialize all elements of the boolean array to false
    for (int i = 0; i < present.length; i++) {
      present[i] = false;
    }

    // Iterate over the array
    for (int i = 0; i < array.length; i++) {
      // Set the corresponding element of the boolean array to true if the number is
      // present in the array
      present[array[i]] = true;
    }

    // Return true if the number is present in the array, false otherwise
    return present[number];
  }

  public static void main(String[] args) {
    int[] array = { 101, 203, 400 };
    int number = 3;

    boolean isPresent = isPresent(array, number);

    if (isPresent) {
      System.out.println("The number " + number + " is present in the array");
    } else {
      System.out.println("The number " + number + " is not present in the array");
    }
  }
}