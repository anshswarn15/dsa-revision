class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<>();
        HashMap<Character,Integer> b = new HashMap<>();

        if (s.length() != t.length()){
            return false;
        }
        else{
            for(int i = 0;i < s.length(); i++){
                char ch = s.charAt(i);
                a.put(ch, a.getOrDefault(ch, 0) + 1);
            }
            for(int j = 0;j < t.length(); j++){
                char ch = t.charAt(j);
                b.put(ch, b.getOrDefault(ch, 0) + 1);
            }
            if(a.equals(b)) return true;
        }
        return false;
    }
}
    
