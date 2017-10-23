import java.util.Scanner;
import java.math.BigInteger;
import java.io.FileNotFoundException;
import java.io.File;

public class LargeSum {
  public static void main(String[] args) throws FileNotFoundException {
    //Will read from the LargeSum.txt file
    Scanner in = new Scanner(new File("LargeSum.txt"));

    //The BigIntegers to get the sum
    BigInteger sum = new BigInteger("0");
    BigInteger curr;

    while(in.hasNext()) {
      curr = new BigInteger(in.next());
      sum = sum.add(curr);
      //System.out.println("Sum: " + sum + "\nCurr: " + curr + "\n");
    }

    System.out.println(sum);

  }
}
