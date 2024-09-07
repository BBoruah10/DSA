package Mathematics;

public class Palindrome {
  public static boolean isPalindrome(int number) {
    int originalNumber = number;  // Store the original number
    int reversedNumber = 0;       // Variable to store the reversed number

    // Reverse the number
    while (number != 0) {
        int digit = number % 10;               // Extract the last digit
        reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber
        number /= 10;                          // Remove the last digit
    }

    // Check if the original number is equal to the reversed number
    return originalNumber == reversedNumber;
}

public static void main(String[] args) {
    int num = 121;  // Input number to check

    if (isPalindrome(num)) {
        System.out.println(num + " is a palindrome.");
    } else {
        System.out.println(num + " is not a palindrome.");
    }
}
}
