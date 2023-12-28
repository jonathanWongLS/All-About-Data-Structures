package Tries;

public class Trie {
    public static class Node {
        private Node[] children = new Node[26];
        private boolean endOfWord;

        public Node() {
            endOfWord = false;
            // 26 letters in the alphabet, 1 space reserved for End-Of-Word
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
        }
    }

    public Node root = new Node();

    public void insert(String word) {
        String strToInsert = word.toLowerCase();
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            int index = strToInsert.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }

    public boolean search(String word) {
        String strToSearch = word.toLowerCase();
        Node curr = this.root;
        for (int i = 0; i < strToSearch.length(); i++) {
            int index = strToSearch.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return curr.endOfWord;
    }
}
