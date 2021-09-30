import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value");
       int num = sc.nextInt();
       boolean isPrime = false;
       for (int i=2;i<=num/2;++i) {
          if (num%i == 0) {
          isPrime = true;
          break;
          }
       }
       if (!isPrime)
       System.out.println(num + " is a prime number.");
       else
       System.out.println(num + " is not a prime number."); 
    }
}
