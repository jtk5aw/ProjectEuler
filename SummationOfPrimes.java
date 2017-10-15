import java.math.BigInteger;
import java.util.Arrays;
public class SummationOfPrimes {
  public static void main(String[] args) {
    /*
    * Finds the sum of all primes below two million
    * BigInteger 	nextProbablePrime()
    *   Returns the first integer greater than this BigInteger that is probably
    *   prime.
    * https://math.stackexchange.com/questions/190666/how-to-prove-this-extended-prime-number-theorem
    * 3k+5k+7k+11k+...+pk∼n^(k+1)/()(k+1)(log(n)−log(k)))
    */
    System.out.print(Helper.primeSum(2000000));

  }
}
