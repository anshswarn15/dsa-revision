import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

       int longestSeq = 0 ;
       Map<Integer, Boolean> exploredmap = new HashMap<>();
       for(int num: nums){
        exploredmap.put(num,Boolean.FALSE);
       }

       for(int num : nums){
        int currentSeq = 1;
        int nextnum = num +1 ; 
        while(exploredmap.containsKey(nextnum) && exploredmap.get(nextnum)==false){
            currentSeq ++;
            exploredmap.put(nextnum, Boolean.TRUE);
            nextnum++;
        }
        nextnum = num -1 ;
        while(exploredmap.containsKey(nextnum) && exploredmap.get(nextnum)==false){
            currentSeq ++;
            exploredmap.put(nextnum, Boolean.TRUE);
            nextnum--;
        }
        longestSeq = Math.max(longestSeq,currentSeq );

       }
       return longestSeq;

    }
}