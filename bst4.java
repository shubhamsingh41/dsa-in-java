public class bst4 {
    //print in range
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

    public static void printinrange(node root , int x ,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <=y){
            printinrange(root.left, x, y);
            System.out.print(root.data +" ");
            printinrange(root.right, x, y);
        }
        else if(root.data >= y){
            printinrange(root.left, x, y);
        }
        else{
            printinrange(root.right, x, y);
        }
    }
    public static void main(String[] args) {
        int value[] = { 8,5,3,1,4,6,10,11,14};
        node root = null;
for (int i = 0; i < value.length; i++) {

    root= insert(root, value[i]);
}
inorder(root);
System.out.println();
printinrange(root, 6, 10);

    }

}
