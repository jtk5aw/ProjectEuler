import java.util.Arrays;
public class SpecialPythagoreanTriple {
  public static void main(String[] args) {
    /*
    * Finds the Pytagorean triple for which a + b + c = 1000
    * https://en.wikipedia.org/wiki/Pythagorean_triple
    * a = m^2 - n^2, b = 2mn, c = m^2 + n^2
    * when m > n > 0
    */

    //Three Pytagorean Numbers
    long[] currentTriple;

    for(long m = 2; m < 999; m++) {
      for(long n = 0; n < m; n++) {
        currentTriple = Helper.pythagoreanTriple(m, n);
        if(Helper.sum(currentTriple) == 1000) {
          System.out.println(Arrays.toString(currentTriple));
          System.out.println(Helper.product(currentTriple));
          m = 999;
          n = m;
        }
      }
    }
  }
}
