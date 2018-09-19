package linkedList;

public class NthFromLast extends InsertLinkedList {

    void displayFromLast(int pos)
    {
        Node fast=head;
        Node slow=head;
        int counter=1;
        while(counter<=pos)
        {
            fast=fast.next;
            counter++;

        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println("the nth from last is  :"+slow.data);
    }

    public static void main(String args[])
    {
        NthFromLast objLL=new NthFromLast();
        objLL.insertAtFront(10);
        objLL.insertAtFront(11);
        objLL.insertAtFront(5);
        objLL.insertAtFront(4);
        objLL.insertAtFront(40);
        objLL.insertAtFront(2);
        objLL.display();
        objLL.displayFromLast(3);
    }

}
