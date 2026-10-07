import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ransom = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            ransom.put(ch, ransom.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            mag.put(ch, mag.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransom.keySet()) {

            if (!mag.containsKey(ch)) {
                return false;
            }

            if (mag.get(ch) < ransom.get(ch)) {
                return false;
            }
        }

        return true;
    }
}