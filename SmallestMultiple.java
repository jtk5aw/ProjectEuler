public class SmallestMultiple {
  private static int[] neccesaryDivisorsOtherThan2 = {3, 5, 7, 11, 13, 17, 19};
  public static void main(String[] args) {
    /*
    * Finds smallest positive number divisible by all numbers from
    * one to twenty.
    * Smallest number divisible by one through 10 is 2520
    */


    //Will keep going until a number is found
    //Assumes no digit less than the digit divsible by 1-10 will be divisible by 1-20
    for(int x = 2521; x > 0; x++) {
      //Done by itself because it will eliminate half the cases right off the bat
      if(x % 2 == 0){
        //Checks the rest of the digits one through 20
        if(checkDivisible(x)) {
          System.out.println(x);
          //if there's an endless loop this is the problem
          break;
        }
      }
    }
  }

  //Checks if the number is divisible from 20-3
  private static boolean checkDivisible(int number) {
    for(int curr : neccesaryDivisorsOtherThan2) {
      if(number % curr != 0)
        return false;
    }
    return true;
  }
}
