import java.util.*;

class Program {
  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    // Brute force approach following Hint 1 + 2
    int[] res = new int[array.length]; // create output array
    int i = 0; // pointer to output array
    for(int num : array){ // foreach element in input array
     res[i++] = num * num; // save squared value to output array
    }
    
    // solution with normal for loop
    // for(int i = 0; i < array.length; i++){
    //   res[i] = array[i] * array[i];
    // }

    Arrays.sort(res); // sort output array since there may be negatives in input array
    return res;
    // one liner solution - same process just inlined
    // return Arrays.stream(array).map(num -> num * num).sorted().toArray();
  }
}
