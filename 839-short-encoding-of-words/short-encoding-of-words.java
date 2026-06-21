class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
    }

    TrieNode root = new TrieNode();

    private boolean insert(String word) {

        TrieNode curr = root;
        boolean isNewWord = false;

        for (int i = word.length() - 1; i >= 0; i--) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
                isNewWord = true;
            }

            curr = curr.children[idx];
        }

        return isNewWord;
    }

    public int minimumLengthEncoding(String[] words) {

        Arrays.sort(words,
                (a, b) -> b.length() - a.length());

        int ans = 0;

        for (String word : words) {

            if (insert(word)) {
                ans += word.length() + 1;
            }
        }

        return ans;
    }
}