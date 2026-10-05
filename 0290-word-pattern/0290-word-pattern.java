class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0 ; i< words.length; i++){
            char a = pattern.charAt(i);
            String b = words[i];

        if(map.containsKey(a)){
            if (!map.get(a).equals(b)) {

                    return false;

                }
        }
        else{
            if(!map.containsValue(b)){
                map.put(a,b);
            }
            else return false;
        }


        }

        return true;
    }
}