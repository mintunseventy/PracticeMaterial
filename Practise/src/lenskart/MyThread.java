package lenskart;

public class MyThread extends  Thread{

    MyThread()
    {
        System.out.println("My Thread");
    }

    public void run()
    {
        System.out.println("bar");
    }

    public void run(String s)
    {
        System.out.println("baz");
    }

    public void display()
    {

    }



}
