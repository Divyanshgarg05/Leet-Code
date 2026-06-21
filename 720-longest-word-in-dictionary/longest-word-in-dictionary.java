class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean eow = false;
    }

    TrieNode root = new TrieNode();

    private void insert(String word) {

        TrieNode curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    private boolean allPrefixesExist(String word) {

        TrieNode curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            curr = curr.children[idx];

            if (!curr.eow) {
                return false;
            }
        }

        return true;
    }

    public String longestWord(String[] words) {

        for (String word : words) {
            insert(word);
        }

        String ans = "";

        for (String word : words) {

            if (allPrefixesExist(word)) {

                if (word.length() > ans.length()) {
                    ans = word;
                }
                else if (word.length() == ans.length()
                        && word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }

        return ans;
    }
}