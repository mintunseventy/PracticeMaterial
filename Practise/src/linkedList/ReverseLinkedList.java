package linkedList;

public class ReverseLinkedList extends InsertLinkedList {

    public Node reverseLL()
    {
        Node prev=null;
        Node next=null;
        Node curr=head;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }


    public Node reverseRecursive(Node curr,Node prev)
    {
        if(curr.next==null)
        {
            head=curr;
            curr.next=prev;
            return null;

        }

        Node next=curr.next;
        curr.next=prev;
        reverseRecursive(next, curr);
        return head;
    }
   /* public void display(Node node)
    {
        while(node!=null)
        {
            System.out.println(" "+node.data);
            node=node.next;
        }
    }*/

    /* Function to print reverse of linked list */
    void printReverse(Node head)
    {
        if (head == null) return;

        // print list of head node
        printReverse(head.next);

        // After everything else is printed
        System.out.print(head.data+" ");
    }

    public static void main(String args[])
    {
        ReverseLinkedList objLL=new ReverseLinkedList();
        objLL.insertAtFront(10);
        objLL.insertAtFront(20);
        objLL.insertAtFront(5);
        objLL.insertAtFront(58);
        objLL.insertAtFront(936);
        objLL.insertAtFront(13);
        objLL.insertAtFront(54);
        objLL.display();
        System.out.println(" After reversing the linked list");
        objLL.reverseLL();
        objLL.display();
        System.out.println(" After reversing the linked list using recursion");
        objLL.reverseRecursive(objLL.head, null);
        objLL.display();
        System.out.println("Print reverse :");
        objLL.printReverse(objLL.head);
        objLL.display();
      }
}
