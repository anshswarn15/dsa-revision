class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);

        int prefixsum = 0;
        int count = 0; 

        for(int num : nums){

            prefixsum += num;
            int requiredsum = prefixsum - k; 
            count += prefixMap.getOrDefault(requiredsum,0);

            prefixMap.put(prefixsum,prefixMap.getOrDefault(prefixsum,0)+1);


        }
        return count;
        
    }
}