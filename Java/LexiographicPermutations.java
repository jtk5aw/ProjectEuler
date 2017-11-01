import java.util.Arrays;
public class LexiographicPermutations {
  static final int MAX = 10;
  public static void main(String[] args) {
    /*
    * Finds millionth Lexiographic Permutation of the numbers 0 - 9
    * Algorithm credit: https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
    */

    //Initialized and fills the array
    int[] currPerm = new int[MAX];
    for(int x = 0; x < MAX; x++) {
      currPerm[x] = x;
    }
    //Counter for Permutation numbers
    int permutation = 1;

    //Finds the one millionth permutation
    //NOT SURE WHY IT IS ONE BEHIND
    while(permutation <= 1000010) {
      if(permutation >= 1000000)
        System.out.println(Arrays.toString(currPerm));
      nextPermutation(currPerm, MAX);
      permutation++;
    }

    //Prints out the result
    System.out.println("The one millionth permutation is: " + Arrays.toString(currPerm));
  }
  //Sets arr to it's next lexiographic permutatio based on max
  private static void nextPermutation(int[] arr, int max) {
    for(int n = arr.length - 1; n > 0; n--) {
      if(arr[n - 1] < arr[n]) {
        //Now arr[n - 1] < arr[n]
        int pivot = n - 1;
        swapInSuffix(arr, pivot);

        //END
        n = 0;
      }
    }
  }
  //Finds the last number < arr[pivot] (will be at least one)
  private static void swapInSuffix(int[] arr, int pivot) {
    //current index in arr
    int n = arr.length - 1;
    //finds the number that is closest to and larger than arr[pivot]
    int diff = 99999999;
    int currDiff;
    int smallestIndex = pivot + 1;
    while(n > pivot) {
      //Current value in arr is greater than arr[pivot]
      if(arr[n] > arr[pivot]) {
        //Finds how much bigger the current value is
        currDiff = arr[n] - arr[pivot];
        //Checks for smallest difference.
        if(currDiff < diff) {
          diff = currDiff;
          smallestIndex = n;
        }
      }
      //n proceeds to the next index
      n--;
    }
    swap(arr, pivot, smallestIndex);
    Arrays.sort(arr, pivot + 1, arr.length);
  }
  //Swaps two values in an array
  private static void swap(int[] arr, int first, int second) {
    //Saves the value at arr[second]
    int temp = arr[second];
    //Swaps the values at indices first and second
    arr[second] = arr[first];
    arr[first] = temp;
  }
}
