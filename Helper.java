import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
public class Helper {
    /*
    * Used as a class to store helper methods
    * when doing Project Euler Problems.
    */

    final static BigInteger TWO = new BigInteger("2");
    final static BigInteger THREE = new BigInteger("3");

    /*
    * MATH METHODS
    */

    //Basic recursive fibonacci method with integers
    public static int fib(int x) {
      if(x == 1)
        return 1;
      return x + fib(x - 1);
    }

    //Determines if an int is Prime. Pretty slow when used repeatedly
    // O(sqrt(n))
    public static boolean isPrime(BigInteger num) {
      if(num.equals(TWO) || num.equals(THREE))
        return true;
      else if(num.compareTo(TWO) == -1 || num.mod(TWO).equals(BigInteger.ZERO) || num.mod(THREE).equals(BigInteger.ZERO))
        return false;
      else {
        BigInteger iterate = new BigInteger("5");
        while(iterate.compareTo(num) == -1) {
          if(num.mod(iterate).equals(BigInteger.ZERO))
            return false;
          iterate = iterate.add(TWO);
        }
        return true;
      }
    }

    //Determines if a long is prime. Also pretty slow
    public static boolean isPrime(long num) {
      if(num == 2 || num == 3)
        return true;
      else if(num < 2 || num % 2 == 0 || num % 3 == 0)
        return false;
      else {
        for(long n = 5; (n * n) <= num; n+=2) {
          if(num % n == 0)
            return false;
        }
        return true;
      }
    }

    //Determines if a BigInteger is prime. Also pretty slow when used repeatedly
    // O(sqrt(n))
    public static boolean isPrime(int num) {
      if(num == 2 || num == 3)
        return true;
      else if(num < 2 || num % 2 == 0 || num % 3 == 0)
        return false;
      else {
        for(int n = 5; (n * n) <= num; n+=2) {
          if(num % n == 0)
            return false;
        }
        return true;
      }
    }

    //Finds a list of primes with upper limit long p
    //http://www.mathblog.dk/sum-of-all-primes-below-2000000-problem-10/
    //Sieve of Eratosthenes
    public static long primeSum(long p) {
      long sum = 0;
      long curr = 2;
      while(curr <= p) {
        if(isPrime(curr))
          sum += curr;
        curr++;
      }
      return sum;
    }


    //Finds the sum of an array of longs
    public static long sum(long[] nums) {
      long sum = 0;
      for(long curr : nums) {
        sum += curr;
      }
      return sum;
    }

    //Fins the sum of an ArrayList of longs
    public static long sum(ArrayList<Long> nums) {
      long sum = 0;
      for(long curr : nums) {
        sum += curr;
      }
      return sum;
    }


    //Finds the product of an array of longs.
    // ??O(n)??
    public static long product(long[] nums) {
      long product = 1;
      for(int n = 0; n < nums.length; n++) {
        product = product * nums[n];
      }
      return product;
    }

    /*Finds a pytagorean triple
    * https://en.wikipedia.org/wiki/Pythagorean_triple
    * Uses Euclids Method
    */
    public static long[] pythagoreanTriple(long m, long n) {
      long[] triple = new long[3];

      triple[0] = m*m - n*n;
      triple[1] = 2 * m * n;
      triple[2] = m*m + n*n;

      return triple;
    }


    /*
    * OTHER METHODS
    */

    //Method used to reverse strings
    //Uses end and begin because this way the whole string isn't traversed as would occur with a basic for loop
    //CREDIT: https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
    public static String reverse(String input){
      char[] in = input.toCharArray();
      int begin=0;
      int end=in.length-1;
      char temp;
      while(end>begin){
          temp = in[begin];
          in[begin]=in[end];
          in[end] = temp;
          end--;
          begin++;
        }
        return new String(in);
      }


      //**** Not sure if this works ****//
      //Method used to cycle all the values in an int[].
      //arr[0] becomes arr[length - 1]
      // O(???)
      /*
      public static int[] cycle(int[] arr) {
      int[] result = new int[arr.length];
      for(int n = 1; n < arr.length; n++) {
        result[n] = arr[n-1];
      }
      result[0] = arr[arr.length - 1];
      return result;
    }
    */


}
