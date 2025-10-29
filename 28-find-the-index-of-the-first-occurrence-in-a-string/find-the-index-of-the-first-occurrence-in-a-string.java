class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int found = -1;
        for(int i=0;i<=n-m;i++){
            for(int j=0;j<m;j++){
                if(haystack.charAt(j + i) != needle.charAt(j)){
                    break;
                }
                if(j == m - 1){
                found = i;
                return found;
            }
            }
            
        }
        return found;
    }
}