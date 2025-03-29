import java.util.*;

public class bst5 {
    //root to leaf paths
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
        }

    }
    public static node insert(node root , int val){
        if(root == null){
            root = new node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
           root.left= insert(root.left ,val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    public static void printpath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
            
        }
        System.out.println();
    }
    public static void printroot2leaf(node root ,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null){
            printpath(path);
        }else{//non leaf
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int value[] = {  8,5,3,1,4,6,10,11,14};
        node root = null;
for (int i = 0; i < value.length; i++) {

    root= insert(root, value[i]);
}
inorder(root);
System.out.println();
printroot2leaf(root, new ArrayList<>());

    }
}//binary search tree easy hai but coding thoda muskil hai dhekna padega isko

