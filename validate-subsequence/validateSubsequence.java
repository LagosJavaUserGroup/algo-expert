
import java.util.*;

class Program {
  public static boolean isValidSubsequence(
    List<Integer> array, List<Integer> sequence
  ) {
    // Write your code here.
    // Hint 3
    int arrayIndex = 0; // pointer to mainArray
    int sequenceIndex = 0; // pointer to sequenceArray
    // Hint 1 + 2
    while(arrayIndex < array.size() && sequenceIndex < sequence.size()){
      // while still within array bounds
      if(array.get(arrayIndex).equals(sequence.get(sequenceIndex))){
        // check for matches in mainArray
        sequenceIndex++; // increment sequenceArray pointer
      }
      arrayIndex++; // increment mainArray pointer
    }
    
    return sequenceIndex == sequence.size(); // boolean for validity
  }
}
