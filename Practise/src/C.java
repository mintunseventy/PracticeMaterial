public class C  {
    Short count=200;
    C go(C c)
    {
        c=null;
        return c;
    }

    C go1(C c)
    {
        this.count=50;

        C temp=new C();
        return c;
    }

   public static void main(String args[])
   {
       C c1=new C();
       C c2=new C();
       C c3=c1.go(c2);
       C c4=c1.go1(c2);
       c4=c2;
               c1=null;
               System.out.println("Hello");

      byte a=100;
      int a1=259;
      byte b=(byte) a1;
      byte c=(byte) (a+b);
      byte d=(byte) (a*100);
     long l=999999999;
     long l1=999999999;
     int i=(int) (l+l1);
      System.out.println(a+ " " +b+ " "+c);
      System.out.println(i);
    }
}
