class Trie {
    class Node {
        Node[] childs = new Node[26];
        boolean eow = false;
        Node() {
            for(int i =0; i< 26; i++) {
                childs[i] = null;
            }
        }
    }
    private Node root = null;
    public Trie() {
        root = new Node();
    }
    public void insert(String word) {
        Node curr = root;
        for(int i =0; i< word.length(); i++) {
            if(curr.childs[word.charAt(i) - 'a'] == null) {
                curr.childs[word.charAt(i) - 'a'] = new Node();
            }
            curr = curr.childs[word.charAt(i) - 'a'];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i =0; i< word.length(); i++) {
            if(curr.childs[word.charAt(i) - 'a'] == null) {
                return false;
            }
            curr = curr.childs[word.charAt(i) - 'a'];
        }
        return curr.eow == true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i =0; i< prefix.length(); i++) {
            if(curr.childs[prefix.charAt(i) - 'a'] == null) {
                return false;
            }
            curr = curr.childs[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */