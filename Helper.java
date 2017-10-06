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


}
