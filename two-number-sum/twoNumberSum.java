import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    // Hint 2 + 3
    // use Set as [LUT]
    HashSet<Integer> set = new HashSet<>();
    for(int num: array){
      // only check for diff between targetSum and currentNumber
      int secondNum = targetSum - num;
      if(set.contains(secondNum)){
        // check whether Set contains this diff
        return new int[]{secondNum, num};
      }
      // add currentNumber to Set [LUT]
      set.add(num);
    }
    return new int[0];
  }
}
