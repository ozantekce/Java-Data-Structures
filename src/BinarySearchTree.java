public class BinarySearchTree {


    private TreeNode root;

    public void add(int value){

        if(root==null){
            root = new TreeNode(value);
        }else{
            addRecursive(root,value);
        }


    }

    private void addRecursive(TreeNode current,int value){

        if(value<current.value){
            if(current.left==null){
                current.left = new TreeNode(value);
            }else {
                addRecursive(current.left,value);
            }

        }else{
            if(current.right==null){
                current.right = new TreeNode(value);
            }else{
                addRecursive(current.right,value);
            }
        }

    }


    public void remove(int value){
        root = removeRecursive(root,value);
    }

    private TreeNode removeRecursive(TreeNode current,int value){

        if(current==null)
            return current;

        if(current.value==value){
            if(current.left==null){
                return current.right;
            }else if(current.right==null){
                return current.left;
            }

            current.value = minValue(current.right);
            current.right = removeRecursive(current.right,current.value);

        }else if(value>current.value){
            current.right = removeRecursive(current.right,value);
        }else{
            current.left = removeRecursive(current.left,value);
        }
        return current;
    }

    private int minValue(TreeNode current)  {

        while (current.left != null)  {
            current = current.left;
        }
        return current.value;
    }


    private void printBinaryTree(TreeNode root, int level){
        if(root==null)
            return;
        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.value);
        }
        else
            System.out.println(root.value);
        printBinaryTree(root.left, level+1);
    }

    public void printBinaryTree(){
        int level = 0;
        if(root==null)
            return;
        printBinaryTree(root.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+root.value);
        }
        else
            System.out.println(root.value);
        printBinaryTree(root.left, level+1);
    }


    private class TreeNode{

        private TreeNode left;
        private TreeNode right;
        private int value;

        public TreeNode(int value) {
            this.value = value;
        }
    }


}
