package linkedList;

public class InsertLinkedList {

    protected Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtFront(int data)
    {

        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head=node;
        }
    }

    public void inserAtEnd(int data)
    {
        Node node=new Node(data);
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=node;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
    }

    public static void main(String args[])
    {
        InsertLinkedList objLL=new InsertLinkedList();
        objLL.insertAtFront(10);
        objLL.insertAtFront(20);
        objLL.insertAtFront(18);
        //objLL.display();
        objLL.inserAtEnd(29);
        objLL.display();

    }

}
