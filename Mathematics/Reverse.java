package Mathematics;

public class Reverse {
  public static int reverseNumber(int number) {
    int reversed = 0;  // Variable to store the reversed number

    // Reverse the digits of the number
    while (number != 0) {
        int digit = number % 10;  // Extract the last digit
        reversed = reversed * 10 + digit;  // Append the digit to reversed
        number /= 10;  // Remove the last digit from the number
    }

    return reversed;  // Return the reversed number
}

public static void main(String[] args) {
    int num = 12345;  // Input number to reverse

    int reversedNum = reverseNumber(num);
    System.out.println("Reversed Number: " + reversedNum);
}
}
