class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> track = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(track.contains(nums[i])){
                return true;
            }
            else{
                track.add(nums[i]);
            }
            
        }
        return false;
    }
}