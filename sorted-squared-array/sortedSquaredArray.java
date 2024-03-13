import java.util.*;

class Program {
  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    int N = array.length;
    int[] res = new int[N];
    // following hint 3 + 4 -> avoid sorting the output array
    int smallerValIdx = 0; // left pointer
    int largerValIdx = N - 1; // right ponter
    int smallerVal = 0;
    int largerVal = 0;
    // traverse the output array in reverse order -> right to left
    for(int i = N - 1; i >= 0; i--){
      smallerVal = array[smallerValIdx]; // current smallest value
      largerVal = array[largerValIdx]; // current largest value
      if (Math.abs(smallerVal) > Math.abs(largerVal)){ 
        // if the absolute value of current smallest value is less than that of current largest value
        // save square of current smallest value to current index of output array
        res[i] = smallerVal * smallerVal; 
        smallerValIdx += 1; // increment left pointer in input array
      } else{
        // otherwise save square of current largest value to current index of output array
        res[i] = largerVal * largerVal;
        largerValIdx -= 1; // decrement right pointer in input array
      }   
      // repeat while within array bounds
    }
    return res;
  }
}
