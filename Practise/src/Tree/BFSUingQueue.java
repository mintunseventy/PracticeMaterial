package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSUingQueue {

    private Node root;

    public BFSUingQueue() {
        // TODO Auto-generated constructor stub
        root=null;
    }

    public static void main(String args[])
    {
        BFSUingQueue bt=new BFSUingQueue();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
       // System.out.println("BFS traversal :");
        //bt.printBFS();
        System.out.println("BFS traversal :");
        bt.printLevelOrder();
     }

    private  void printBFS() {
        // TODO Auto-generated method stub
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node tempNode=queue.poll();
            System.out.println(" "+tempNode.ele);
            if(tempNode.left!=null);
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

     void printLevelOrder()
    {
        // Base Case
        if(root == null)
            return;

        // Create an empty queue for level order tarversal
        Queue<Node> q =new LinkedList<Node>();

        // Enqueue Root and initialize height
        q.add(root);


        while(true)
        {

            // nodeCount (queue size) indicates number of nodes
            // at current level.
            int nodeCount = q.size();
            if(nodeCount == 0)
                break;

            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while(nodeCount > 0)
            {
                Node node = q.peek();
                System.out.print(node.ele + " ");
                q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            System.out.println();
        }
    }
}
