import java.util.*;

class Solution {
    class Pair implements Comparable<Pair> {
        int num;
        int count;

        Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }

        public int compareTo(Pair other) {
            return Integer.compare(this.count, other.count);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a Min-Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int num : map.keySet()) {
            pq.add(new Pair(num, map.get(num)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Extract K elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().num;
        }

        return result;
    }
}