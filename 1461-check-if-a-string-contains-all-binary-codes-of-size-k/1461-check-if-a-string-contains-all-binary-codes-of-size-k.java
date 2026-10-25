class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int codes = 1<<k;

        for(int i = k ; i<=s.length(); i++){
            String sub = s.substring(i-k, i);
            if (set.add(sub)){
                codes--;
            }
            if(codes == 0){
                return true;
            }
        }
        return false;
        
    }
}