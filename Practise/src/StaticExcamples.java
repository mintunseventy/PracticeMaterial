
public class StaticExcamples {


     int a=10;
     StaticExcamples(int a)
     {
         this.a=a;
         System.out.println("Inside StaticExcamples cons");
     }

    Integer obj;

   static  void display()
    {
         Integer obj11 = null;
         int b = 0;
        //System.out.println("Insdie static"+a+"  "+obj+ " "+obj11);
    }

   void display1()
   {
       System.out.println("StaticExcamples");
   }
   /* public static void main(String args[])
    {
        StaticExcamples obj1=new StaticExcamples();
       obj1.display();
    }*/
}
