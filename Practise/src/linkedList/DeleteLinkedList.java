package linkedList;

public class DeleteLinkedList extends InsertLinkedList{

    public void deletAtElement(int ele)
    {
        Node temp=head;
        while(temp.next.data!=ele)
            temp=temp.next;
        temp.next=temp.next.next;
    }

    public void deleteAlternateNode()
    {
        Node temp=head.next;
        Node prev=head;
        while(temp!=null && prev!=null)
        {
            prev.next=temp.next;
            temp=null;
            prev=prev.next;
            if(prev!=null)
                temp=prev.next;
        }

    }



    public static void main(String args[])
    {
        DeleteLinkedList objLL=new DeleteLinkedList();
        objLL.insertAtFront(10);;
        objLL.inserAtEnd(23);
        objLL.inserAtEnd(30);
        objLL.inserAtEnd(25);
        objLL.display();
        System.out.println("After Deleting : \n");
        //objLL.deletAtElement(30);
        objLL.deleteAlternateNode();
        objLL.display();
       // objLL.display();
    }
}
