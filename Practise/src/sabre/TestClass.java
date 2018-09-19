package sabre;

class Consructor
{

    static String str;
    public void Consructor()
    {
        System.out.println("In constructor");
        str="Hello world";
    }
}
public class TestClass {

    static String str;
    static volatile int counter=0;


    public void TestClass()
    {
            System.out.println("In constructor");
            str="Hello Worls";
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread one=new Thread(new Task());
        one.setName("one");
        Thread two=new Thread(new Task());
        two.setName("two");
        one.start();
        two.start();
        System.out.println("main completed"+counter);
        //question1();
       // question2();

    }
    static void question3()
    {
        Consructor c=new Consructor();
        System.out.println(c.str);
    }

   static void question1()
   {
       Consructor c=new Consructor();
       System.out.println(str);
   }

   static void question2()
   {
      // Runnable obj=() -> { for(int i=0;i<100;i++) counter++;};
       Thread one=new Thread(new Task());
       one.setName("one");
       Thread two=new Thread(new Task());
       two.setName("two");
       one.start();
       two.start();
       System.out.println("main completed"+counter);

   }

   private static class Task implements Runnable
   {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<100;i++)
            {
            counter++;
            }

    }

   }

}
