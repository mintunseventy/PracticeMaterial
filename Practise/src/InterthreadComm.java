import java.util.LinkedList;
import java.util.Queue;

public class InterthreadComm {

    public static void main(String args[])
    {
        final Queue sharedq=new LinkedList();
        InterthreadComm obj=new InterthreadComm();
        Thread p=new Producer(sharedq);
        Thread q=new Consumer(sharedq);
        p.start();q.start();
    }

}
