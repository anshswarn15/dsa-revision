import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength = 0;

        Map<Integer, Boolean> exploredMap = new HashMap<>();

        // Step 1: Store all numbers as unexplored
        for (int num : nums) {
            exploredMap.put(num, Boolean.FALSE);
        }

        // Step 2: Explore consecutive numbers
        for (int num : nums) {

            int currentLength = 1;

            // Check forward direction
            int nextNum = num + 1;

            while (exploredMap.containsKey(nextNum)
                    && exploredMap.get(nextNum) == false) {

                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            // Check reverse direction
            int prevNum = num - 1;

            while (exploredMap.containsKey(prevNum)
                    && !exploredMap.get(prevNum)) {

                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }

            // Update the longest sequence length
            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}