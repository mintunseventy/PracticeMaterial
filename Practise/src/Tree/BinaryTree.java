package Tree;

public class BinaryTree {

   private Node root;

    public BinaryTree() {
        // TODO Auto-generated constructor stub
        root=null;
    }

    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        System.out.println("Inorder :");
        bt.printInorder(bt.root);
        System.out.println("Preorder :");
        bt.printPreOrder(bt.root);
        System.out.println("Postorder  :");
        bt.printPostOrder(bt.root);
        System.out.println("BFS :");
        bt.printLevelOrderBFS();

    }

    void printInorder(Node node)
    {
        if(node==null)
            return;
        printInorder(node.left);
        System.out.println(" "+node.ele);
        printInorder(node.right);
    }

    void printPreOrder(Node node)
    {
        if(node==null)
            return;
        System.out.println(" "+node.ele);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node)
    {
        if(node==null)
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(" "+node.ele);
    }


    int height(Node root)
    {
         if(root==null)
             return 0;
         else{
             int lheight=height(root.left);
             int rheight=height(root.right);
                     if(lheight>rheight)
                         return lheight+1;
                     else
                         return rheight+1;
         }
    }

     void printGivenLevel(Node root,int level)
     {
         if(root == null)
             return;
         if(level==1)
             System.out.println(root.ele+" ");
         else if(level>1)
         {
             printGivenLevel(root.left, level-1);
             printGivenLevel(root.right, level-1);
         }
     }

     void printLevelOrderBFS()
     {
         int h=height(root);
         int i;
         for(i=1;i<=h;i++)
             printGivenLevel(root, i);
     }
}
