public class binarytree8 {
    //diameter of tree
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class binarytreee{
        static int idx = -1;
        public static node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left =buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    }
    public static int height(node root){
        if(root == null){
            return 0;
        }
    
        int leftheight = height(root.left);
        int rightheight = height(root.right);
    
        int myheight = Math.max(leftheight, rightheight) +1;
        return myheight;
       }

    public static int diameter(node root){
        if(root == null){
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left)+ height(root.right) +1;

        return Math.max(dia3,Math.max(dia1, dia2));
    }

    public static void main(String[] args) {
        int nodes[] ={ 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytreee tree = new binarytreee();
        node root = tree.buildtree(nodes);
        System.out.println(diameter(root));
    }
}
