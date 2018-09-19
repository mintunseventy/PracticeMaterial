package lenskart;

public class TestThreads {

    public static void main(String[] args) {

        Thread t111=new Thread(new  Runnable() {

            public void run() {

            }
        });
        // TODO Auto-generated method stub
        Thread t=new Thread(){
          public void run()
          {
              MyThread mt=new MyThread();
              mt.display();
          }
        };

        t.start();

        Thread t1=new Thread(new MyThread());
        t1.start();

        Thread t2=new Thread(new MyThread());
        t2.start();

        Thread t3=new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        });

        Thread t22=new Thread(new MyThread(),"HEllo");
        Thread trr = new Thread(new MyThread());

    }

}
