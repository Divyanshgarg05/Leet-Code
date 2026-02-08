import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    // keypad mapping using array (index = digit)
    String[] map = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    private void solve(int idx, String digits, StringBuilder temp) {

        // base case
        if (idx == digits.length()) {
            result.add(temp.toString());
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            temp.append(letters.charAt(i));   // choose
            solve(idx + 1, digits, temp);     // explore
            temp.deleteCharAt(temp.length() - 1); // backtrack
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        solve(0, digits, new StringBuilder());
        return result;
    }
}
