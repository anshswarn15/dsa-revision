
import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        List<Integer> prefixSum = new ArrayList<>();
        int sum = 0;
        prefixSum.add(0);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum.add(sum);
        }

        for (int i = 0; i < nums.length; i++) {
            if (prefixSum.get(i) == prefixSum.get(prefixSum.size() - 1) - prefixSum.get(i + 1)) {
                return i;
            }
        }

        return -1;
    }
}
