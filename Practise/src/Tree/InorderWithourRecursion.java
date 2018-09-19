package Tree;

import java.util.Stack;

public class InorderWithourRecursion {

        private Node root;

        public static void main(String args[])
        {
            InorderWithourRecursion bt=new InorderWithourRecursion();
            bt.root=new Node(1);
            bt.root.left=new Node(2);
            bt.root.right=new Node(3);
            bt.root.left.left=new Node(4);
            bt.root.left.right=new Node(5);
            System.out.println("Inorder  traversal :");
            bt.inOrder();
            System.out.println("Preorder  traversal :");
            bt.preOrder();
            System.out.println("POstorder  traversal :");
            bt.postOrder();
        }


        void preOrder()
        {
            if(root==null)
                return;

            Stack<Node> stack=new Stack<Node>();
            Node node=root;
            stack.push(node);
            while(stack.size()>0)
            {
                node=stack.pop();
                System.out.println(node.ele+" ");
                if(node.right!=null)
                    stack.push(node.right);
                if(node.left!=null)
                    stack.push(node.left);
            }

        }


        void inOrder()
        {
            if(root==null)
                return;
            Stack<Node> stack=new Stack<Node>();
            Node node=root;

            while(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            while(stack.size()>0){

                node=stack.pop();
                System.out.println(node.ele+" ");
                if(node.right!=null)
                {
                    node=node.right;
                    while(node!=null)
                    {
                        stack.push(node);
                        node=node.left;
                    }
                }

            }
        }

        void postOrder()
        {
            Stack<Node> stack1=new Stack<>();
            Stack<Node> stack2=new Stack<>();
            Node node=root;
            stack1.push(node);
            while(!stack1.isEmpty())
            {
                node=stack1.pop();
                stack2.push(node);

                if(node.left!=null)
                    stack1.push(node.left);
                if(node.right!=null)
                    stack1.push(node.right);
            }

            while(!stack2.isEmpty())
            {
                Node temp=stack2.pop();
                System.out.println(temp.ele);
            }

        }
}
