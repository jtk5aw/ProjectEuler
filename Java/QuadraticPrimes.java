public class QuadraticPrimes {
  public static void main(String[] args) {
    /*
      Find a quadratic of the form
      n^2 + an + b where abs(a) < 1000 abs(b) <= 1000
      such that the quadratic produces the most consecutive prime numbers starting
      at n = 0
    */

    //NOTE: I don't think negative numbers can be prime so abs(b) > 0

    int primeCountMax = 0, n = 0;
    int[] aAndB = new int[2];

    //Loops through a values
    for(int a = -999; a <= 999; a++) {
      //Loops through b values
      for(int b = 1; b <= 1000; b+=2) { //No need to check evens as at n = 0 it won't be prime.
        n = 0;
        //Checks primalty of current n value using the quadratic
        while(Helper.isPrime((n * n) + a * n + b)) {
          n++;
        }
        //Finds new max prime count
        primeCountMax = Math.max(n, primeCountMax);
        if(primeCountMax == n) {
          aAndB[0] = a;
          aAndB[1] = b;
        }
      }
    }

    //Prints out the result
    System.out.println("The coefficient product is" + (aAndB[0] * aAndB[1]));
  }
}
