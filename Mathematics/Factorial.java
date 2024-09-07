package Mathematics;

public class Factorial {
  public long factorial(int N) {
    long fact=1;
    for(int i=N;i>0;i--){
        fact=fact*i;
    }
    return fact;
}
public static void main(String[] args) {
  Factorial f = new Factorial(); // Create an instance of the Factorial class
  int number = 5; // Number to compute factorial for
  long result = f.factorial(number); // Compute the factorial
  System.out.println("Factorial of " + number + " is " + result); // Print the result
}
}
