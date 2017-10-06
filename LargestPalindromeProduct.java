public class LargestPalindromeProduct {
  public static void main(String[] args) {
    /*
    * Will compute the largest palindrome
    * created by multiplying two three digit numbers.
    */

    //Will track the largest palindrome
    int largest = 0;
    //Current product
    int product = 0;

    //Will go from x to 999 and multiply the numbers together always checking for a palindrome
    for(int x = 100; x < 1000; x++) {
      for(int y = x; y < 1000; y++) {
        product = y * x;
        if(checkPalindrome(product) && product > largest)
          largest = product;
      }
    }

    System.out.println("The largest palindrome is: " + largest);

  }
  private static boolean checkPalindrome(int num) {
    String theInt = "" + num;
    String reversed = Helper.reverse(theInt);

    return (theInt.equals(reversed));
  }
}
