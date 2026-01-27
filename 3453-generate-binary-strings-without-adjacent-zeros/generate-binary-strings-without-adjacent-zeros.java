class Solution {

    public void generate(int n, int last, String str, List<String> ans) {
        // base case
        if (n == 0) {
            ans.add(str);
            return;
        }

        // You can always place '1'
        generate(n - 1, 1, str + "1", ans);

        // Place '0' only if last was not '0'
        if (last != 0) {
            generate(n - 1, 0, str + "0", ans);
        }
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, -1, "", ans); // -1 → no previous character
        return ans;
    }
}
