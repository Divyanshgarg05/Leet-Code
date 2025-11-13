class Solution {
    public String reverseWords(String s) {
       
        String[] words = s.trim().split("\\s+");

        String res = words[words.length-1];
        for(int i=words.length-2;i>=0;i--){
            res = res +" "+ words[i];
        }
        return res;
    }
}