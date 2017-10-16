import java.math.BigDecimal;
public class SumSquareDifference {
  public static void main(String[] args) {
    /*
    * Calculates the difference between teh sum of the squares of natural numbers
    * 1 - 100 and the square of the sum of all natural numbers 1 - 100.
    */

    //Two sums to be calculated
    long sumOfSquares = 0;
    long squareOfSum = 0;

    for(int x = 1; x <= 100; x++) {
      sumOfSquares += Math.pow(x, 2);
      squareOfSum += x;
    }
    double squareSum = Math.pow(squareOfSum, (long)2);
    //Use BigDecimal to print the double as a number rather than in scientific notation.
    System.out.println(new BigDecimal(squareSum - sumOfSquares).toPlainString());
  }
}
