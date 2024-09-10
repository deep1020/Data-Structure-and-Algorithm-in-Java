package Trie;

public class word_break {
    static class Node{
        Node[] children;
        boolean endOfWord;
        public Node(){
            children=new Node[26]; // a-z
            for(int i=0;i<26;i++){ // Initialize null for every node a-z
                children[i]=null;
            }
            endOfWord=false; // Initialize false for end of word
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root; // If value of Node root is changed, we can't get an original value
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a'; // Find index of each character
            if(curr.children[idx]==null){ // Null value stored, create a new node
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){ // Make endOfWord true when we reach at the last node
                curr.children[idx].endOfWord=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==key.length()-1 && curr.children[idx].endOfWord==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word[]={"i","like","sam","samsung","mobile"};
        String key="ilikesamsung";
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(wordBreak(key));
    }
}
