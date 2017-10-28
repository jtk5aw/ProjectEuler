public class LongestCollatzSequence {
  public static void main(String[] args) {
    //Stores the longest Collatz sequence
    int longestCollatz = 0;
    long numWithLongest = 0;
    //Current Number of the collatz Sequence and current Collatz counter
    long tracker;
    int currCollatz;

    //Loops through all numbers 1 - 1 million
    for(long n = 1; n <= 1000000; n++) {
      tracker = n;
      currCollatz = 1;
      while(tracker != 1) {
        currCollatz++;
        //N is even
        if(tracker % 2 == 0)
          tracker/=2;
        //N is odd
        else
          tracker = tracker * 3 + 1;
      }
      //Compares current sequence to the current longest sequence;
      longestCollatz = Math.max(longestCollatz, currCollatz);
      if(longestCollatz == currCollatz)
        numWithLongest = n;
    }
    //Prints the longest sequence
    System.out.println("The largest Collatz sequence is: " + longestCollatz + "\nNumber with longest Collatz sequence: " + numWithLongest);

  }
}
