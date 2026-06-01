class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int count = t.length();  // number of characters we still need
        int i = 0, j = 0;
        String ans = "";

        while (j < s.length()) {
            char c = s.charAt(j);
            if (need.containsKey(c)) {
                need.put(c, need.get(c) - 1);
                if (need.get(c) >= 0) count--;
            }

            // shrink window from left while valid
            while (count == 0) {
                String sub = s.substring(i, j + 1);
                if (ans.equals("") || sub.length() < ans.length()) {
                    ans = sub;
                }

                char left = s.charAt(i);
                if (need.containsKey(left)) {
                    need.put(left, need.get(left) + 1);
                    if (need.get(left) > 0) count++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}