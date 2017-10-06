public class EvenFibonacciNumbers {
  public static void main(String[] args) {
      /*
      * Program sums up all even numbers in the
      * Fibonacci Sequence that are less than
      * 4 million.
      */


      //Current term in the Fibonacci Sequence
      int now = 2;
      //Last term in the Fibonacci Sequence
      int then = 1;
      //Transfers these two between each other
      int temp = 0;

      //This is the sum. (Starts at two because now starts at 2)
      int sum = 2;


      while(now <= 4000000) {
        //Creates the next term and sets last term
        temp = now;
        now += then;
        then = temp;

        //Adds to sum
        if(now % 2 == 0)
          sum += now;
      }
      System.out.println("This is the sum: " + sum);
  }
}
