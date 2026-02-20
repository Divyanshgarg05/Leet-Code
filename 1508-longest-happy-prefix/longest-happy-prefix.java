class Solution {
    public String longestPrefix(String s) {
        if (s == null || s.length() <= 1) return "";

        int[] lps = new int[s.length() + 1];

       
        lps[0] = -1;
        lps[1] = 0;

        int i = 2;
        int prefixLen = 0; 

        while (i < lps.length) {
          
            if (s.charAt(i - 1) == s.charAt(prefixLen)) {
                lps[i++] = ++prefixLen; 
            }     
            
           
            else if (prefixLen > 0) 
                prefixLen = lps[prefixLen];
            
           
            else lps[i++] = 0; 
        }

       
        return s.substring(0, lps[s.length()]);
    }
}