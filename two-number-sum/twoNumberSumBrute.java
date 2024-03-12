import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
  // Hint 1 approach
    for(int i = 0; i < array.length-1; i++){
      for(int j = i + 1; j < array.length; j++){
        // brute force approach
        if(array[i] + array[j] == targetSum){
          // radically check if 2 numbers sum up to targetSum using 2 pointers
          return new int[]{array[i], array[j]};
        }
      }
    }   
    return new int[0];
  }
}
