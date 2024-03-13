
import java.util.*;
import java.util.stream.Collectors;


class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
   List<Integer[]> result = new ArrayList<>();

    Arrays.sort(array); // hint 2 -> sort input array
    // hint 2 -> traverse array once after sorting
    for (int i = 0; i < array.length - 2; i++) {
      // avoid duplicates
      if (i > 0 && array[i] == array[i - 1]) {
        // start processing from next unique array element
        continue;
      }
      // hint 2 -> create 2 more pointers to form a triplet 
      int currentNum = array[i]; // currentNumber
      int left = i + 1; // pointer to nextNumber to the right of currentNumber
      int right = array.length - 1; // pointer to lastNumber in array
      
      while (left < right) { // while within array bounds
        int currentSum = currentNum + array[left] + array[right]; // take currentSum
        if (currentSum == targetSum) { // compare currentSum with targetSum
          // if they're equal put this triplet in 2D array [output array]
          result.add(new Integer[]{currentNum, array[left], array[right]});
          // Skip duplicates always
          while (left < right && array[left] == array[left + 1]) {
              left++;
          }
          while (left < right && array[right] == array[right - 1]) {
              right--;
          }
          // increment left pointer + decrement right pointer
          left++;
          right--;
        } else if (currentSum < targetSum) {
          // if currentSum is less than targetSum increment left pointer since array is sorted
          left++;
        } else {
          // otherwise decrement right pointer
          right--;
        }
      // repeat to check for other triplets while within array bounds
      }
    }

    return result.stream().distinct().collect(Collectors.toList());
  }
}
