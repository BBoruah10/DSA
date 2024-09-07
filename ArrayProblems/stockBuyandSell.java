package ArrayProblems;

public class stockBuyandSell {
  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
        return 0;
    }

    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price; // Update the minimum price encountered so far
        } else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice; // Update the maximum profit if better profit is found
        }
    }

    return maxProfit;
}

// Main method to test the maxProfit method
public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int profit = maxProfit(prices);
    System.out.println("Maximum profit is: " + profit);
}
}
