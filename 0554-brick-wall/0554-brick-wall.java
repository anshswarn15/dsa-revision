class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Long,Integer> edgeFreq = new HashMap<>();
        int size =  wall.size();
        int maxEdgeFreq = 0;
        for(List<Integer> row : wall){
            long idx = 0;
            for(int i = 0 ; i<row.size()-1; i++){

                idx += row.get(i);
                edgeFreq.put(idx,edgeFreq.getOrDefault(idx,0)+1);
                maxEdgeFreq = Math.max(maxEdgeFreq,edgeFreq.get(idx));
            }
        
        }
        return size - maxEdgeFreq;
        
    }
}