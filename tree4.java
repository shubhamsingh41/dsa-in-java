public class tree4 {
    //longest word with all prefixes
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

    public static String ans = "";
    public static void longestword(Node root ,StringBuilder temp){
        if(root == null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length() >ans.length()){
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
            
        }
    }
    public static void main(String[] args) {
        String words[] = {"a" , "banana" ,"app","appl","ap","apply","apple"};
       for (int i = 0; i < words.length; i++) {
           insert(words[i]);
       }
       longestword(root, new StringBuilder(""));
       System.out.println(ans);
    }

}
