import java.math.BigDecimal;
public class SumSquareDifference {
  public static void main(String[] args) {
    //Two sums to be calculated
    long sumOfSquares = 0;
    long squareOfSum = 0;

    for(int x = 1; x <= 100; x++) {
      sumOfSquares += Math.pow(x, 2);
      squareOfSum += x;
    }
    double squareSum = Math.pow(squareOfSum, (long)2);
    System.out.println(new BigDecimal(squareSum - sumOfSquares).toPlainString());
  }
}
