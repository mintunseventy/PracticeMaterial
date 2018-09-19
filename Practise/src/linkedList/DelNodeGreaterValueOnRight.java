package linkedList;

public class DelNodeGreaterValueOnRight extends InsertLinkedList {

    public static void main(String args[])
    {
        DelNodeGreaterValueOnRight objLL=new DelNodeGreaterValueOnRight();
        objLL.insertAtFront(60);
        objLL.insertAtFront(50);
        objLL.insertAtFront(40);
        //objLL.display();
        objLL.insertAtFront(30);
        objLL.insertAtFront(20);
        objLL.insertAtFront(10);
        objLL.display();
        System.out.println("After Alternation");
        objLL.delNodeGreaterValueOnRight();
        objLL.display();


    }

    private void delNodeGreaterValueOnRight() {
        Node newNode=head;
        Node second=head;
        Node temp;

        while(second.next !=null)
        {

            if(second.next.data<newNode.data)
            {
                temp = second.next;
                second.next = temp.next;
            }else
                {
                second=second.next;
                newNode=second;

            }
        }
       // newNode=second;

    }


}
