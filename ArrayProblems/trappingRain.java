package ArrayProblems;

public class trappingRain {
  public static int trap(int[] heights) {
    if (heights == null || heights.length == 0) {
        return 0;
    }

    int n = heights.length;
    int left = 0;
    int right = n - 1;
    int leftMax = 0;
    int rightMax = 0;
    int waterTrapped = 0;

    while (left <= right) {
        if (heights[left] <= heights[right]) {
            if (heights[left] >= leftMax) {
                leftMax = heights[left];
            } else {
                waterTrapped += leftMax - heights[left];
            }
            left++;
        } else {
            if (heights[right] >= rightMax) {
                rightMax = heights[right];
            } else {
                waterTrapped += rightMax - heights[right];
            }
            right--;
        }
    }

    return waterTrapped;
}

// Main method to test the trap method
public static void main(String[] args) {
    int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int trappedWater = trap(heights);
    System.out.println("Amount of trapped rainwater is: " + trappedWater);
}
}
