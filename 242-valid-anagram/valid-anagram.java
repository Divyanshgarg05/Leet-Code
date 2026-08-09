class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> s1 = new HashMap<>();
        Map<Character,Integer> t1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
        }
        if(s1.equals(t1)){
            return true;
        }else{
            return false;
        }
    }
}