import java.util.HashMap;
import java.util.Map;
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {
            int a = Math.min(domino[0], domino[1]);
            int b = Math.max(domino[0], domino[1]);
            String key = a + "," + b;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int res = 0;
        for (int k : map.values()) {
            res += k * (k - 1) / 2;
        }
        return res;
    }
}