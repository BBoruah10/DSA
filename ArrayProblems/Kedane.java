package ArrayProblems;

public class Kedane {
  public static int findMaxSum(int[] array) {
    if (array.length == 0) {
        throw new IllegalArgumentException("Array must not be empty");
    }

    int maxCurrent = array[0];
    int maxGlobal = array[0];

    for (int i = 1; i < array.length; i++) {
        maxCurrent = Math.max(array[i], maxCurrent + array[i]);
        if (maxCurrent > maxGlobal) {
            maxGlobal = maxCurrent;
        }
    }

    return maxGlobal;
}

// Main method to test the findMaxSum method
public static void main(String[] args) {
    int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int maxSum = findMaxSum(array);
    System.out.println("Maximum sum of contiguous subarray is: " + maxSum);
}
}
