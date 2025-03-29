public class bst3 {
    //delete a node
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
    public static node delete(node root , int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{//case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
          //case 3
          node Is = inordersuc(root.right);
          root.data = Is.data;
           root.right = delete(root.right, Is.data);
        }
        return root;
    }
    public static node inordersuc(node root){
        while(root.left != null){
            root = root.left;
        }
     return root;
    }
    public static void main(String[] args) {
        int value[] = { 8,5,3,1,4,6,10,11,14};
        node root = null;
for (int i = 0; i < value.length; i++) {

    root= insert(root, value[i]);
}
inorder(root);
System.out.println();

 delete(root, 5);
 inorder(root);

    }
}
//bahut imp hai khas kar hi wo inordersuc wala condition
//case 3 is imp 