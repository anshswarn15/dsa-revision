import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSumRem = 0;

        // Store remainder -> earliest prefix position
        Map<Integer, Integer> firstOcc = new HashMap<>();
        firstOcc.put(0, 0);

        for (int i = 0; i < nums.length; i++) {
            prefixSumRem = (prefixSumRem + nums[i]) % k;

            if (firstOcc.containsKey(prefixSumRem)) {
                if ((i + 1) - firstOcc.get(prefixSumRem) >= 2) {
                    return true;
                }
            } else {
                firstOcc.put(prefixSumRem, i + 1);
            }
        }

        return false;
    }
}