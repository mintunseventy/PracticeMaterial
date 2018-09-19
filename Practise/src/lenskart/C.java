package lenskart;


public class C  {
    int i,j;
    C(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    static void swap(C c1,C c2)
    {
        c1.i=20;
        c1.j=30;
        C Temp=c1;
        c1=c2;
        c2=Temp;
    }
    C go(C c)
    {
        c=null;
        return c;
    }


   public static void main(String args[])
   {
       C c1=new C(1,1);
       C c2=new C(2,2);
       C c3=c1.go(c2);
       c1=null;
       swap(c1,c2);
               System.out.println("Hello");
    }

}