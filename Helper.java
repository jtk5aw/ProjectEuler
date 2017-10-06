public class Helper {
  /*
  * Used as a class to store helper methods
  * when doing Project Euler Problems.
  */

  public static int fib(int x) {
    if(x == 1)
      return 1;
    return x + fib(x - 1);
  }

}
