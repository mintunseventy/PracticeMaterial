
public class RunnableThread  implements Runnable{

    int counter=0;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        counter++;
        System.out.println("Incrementing Counter  "+counter );

    }

    public static void main(String args[]) throws InterruptedException
    {
        RunnableThread rt=new RunnableThread();

        /*for(int i=0;i<5;i++)
        {
        Thread th1=new Thread(rt);
        th1.start();
        th1.sleep(1000);

        }*/
        Thread th1=new Thread(rt);
        th1.start();
        Thread.sleep(1000);
        Thread th2=new Thread(rt);
        th2.start();
        Thread.sleep(1000);
        Thread th3=new Thread(rt);
        th3.start();
        Thread.sleep(1000);

    }


}
