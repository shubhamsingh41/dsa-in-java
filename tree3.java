public class tree3 {
    //count unique substring
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
 
 
        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
                
            }
            eow = false;
        }
    }
 
 
    public static Node root = new Node();
 
 
    public static void insert(String word) { 
       
 
        Node curr = root;
        for(int i =0; i<word.length(); i++) {
           int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if(i== word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
 
 
    public static boolean search(String key) { 
       
 
        Node curr = root;
        for(int i =0 ; i<key.length(); i++) {
          int idx = key.charAt(i)-'a';
          Node node = curr.children[idx];
            if(node  == null) {
                return false;
            }
            if(i == key.length()-1 && node.eow ==false){
                return false;
            }  
              curr = curr.children[idx];
        }
        return true;
    }

    public static int countnode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i =0 ; i<26;i++ ){
            count += countnode(root.children[i]);
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
            
        }
        System.out.println(countnode(root));
    }
}
