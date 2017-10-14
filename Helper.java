public class Helper {
  /*
  * Used as a class to store helper methods
  * when doing Project Euler Problems.
  */

  /*
  * MATH METHODS
  */

  //Basic recursive fibonacci method with integers
  public static int fib(int x) {
    if(x == 1)
      return 1;
    return x + fib(x - 1);
  }

  //Determines if a number is Prime. Pretty slow when used repeatedly
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

    //Finds the product of an array of longs.
    // ??O(n)??
    public static long product(long[] nums) {
      long product = 1;
      for(int n = 0; n < nums.length; n++) {
        product = product * nums[n];
      }

      return product;
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
