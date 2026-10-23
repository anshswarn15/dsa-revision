class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();


        for(int num : nums){
            if(count.containsKey(num)) return num; 
            else {
                count.put(num, 1);
            }

        }
    return -1;
    }
    
    }