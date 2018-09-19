package linkedList;

public class AlterSplitting extends InsertLinkedList{

    public static void main(String args[])
    {
        AlterSplitting objLL=new AlterSplitting();
        objLL.insertAtFront(0);
        objLL.insertAtFront(1);
        objLL.insertAtFront(0);
        //objLL.display();
        objLL.insertAtFront(1);
        objLL.insertAtFront(0);
        objLL.insertAtFront(1);
        objLL.display();
        objLL.alternateSplitting();
        objLL.display();


    }

    public void alternateSplitting()
    {

        Node first=head;
        Node second=head.next;

        while(first!=null && second!=null)
        {
            first.next=second.next;
            first=first.next;
            if(first!=null)
                {
                //second.next=first.next;
                second=first.next;
                }
        }

        System.out.println("Hello");
    }

}
