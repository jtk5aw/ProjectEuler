public class Prime10001st {
  public static void main(String[] args) {
    /*
    * Finds the 1001st prime number.
    */

    //Number of primes
    int primeCount = 0;
    //current number
    int n = 0;

    while(primeCount != 10001) {
      n++;
      if(Helper.isPrime(n)) {
        primeCount++;
        //System.out.println("N: " + n + " is " + primeCount);
      }
    }

    System.out.println("The " + primeCount + "st prime is: " + n);
  }
}
