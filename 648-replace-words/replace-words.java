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

    private String searchRoot(String word) {

        TrieNode curr = root;
        StringBuilder prefix = new StringBuilder();

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                return word;
            }

            prefix.append(ch);
            curr = curr.children[idx];

            if (curr.eow) {
                return prefix.toString();
            }
        }

        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {

        for (String word : dictionary) {
            insert(word);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            ans.append(searchRoot(word)).append(" ");
        }

        ans.setLength(ans.length() - 1);

        return ans.toString();
    }
}