class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1 = new HashMap<>();
        Map<Character,Integer> t1 = new HashMap<>();

        for(char c : s.toCharArray()){
            s1.put(c,s1.getOrDefault(c,0)+1);
        }

         for(char c : t.toCharArray()){
            t1.put(c,t1.getOrDefault(c,0)+1);
        }
        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }
    }
}