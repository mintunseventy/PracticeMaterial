
public class ExtendThread extends Thread{

        int counter=0;
    @Override
    public void run()
    {
        counter++;
        System.out.println("  "+counter);
    }

    public static void main(String args[]) throws InterruptedException
    {
        ExtendThread rt=new ExtendThread();
        /*for(int i=0;i<5;i++)
        {
        Thread th1=new Thread(rt);
        th1.start();
        th1.sleep(1000);
        }*/
        ExtendThread th1=new ExtendThread();
        th1.start();
        Thread.sleep(1000);
        ExtendThread th2=new ExtendThread();
        th2.start();
        Thread.sleep(1000);
        ExtendThread th3=new ExtendThread();
        th3.start();
        Thread.sleep(1000);
    }
}
