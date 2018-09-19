package Barclays;

import java.util.Collection;
import java.util.TreeSet;

public class A {

    int x,y;
    static String str;

    public static void main(String[] args) {

        byte a1[]={65,66,67,68,69,70};
        byte b1[]={71,72,73,74,75,76};
        System.arraycopy(a1, 2, b1, 1, a1.length-3);
        System.out.println(new String(a1)+ "  "+ new String(b1));

        double a =295.04;
        int b=300;
        byte c =(byte) a;
        byte d =(byte) b;

        System.out.println(c + " "+ d);
       System.out.println(295.04%128+" "+300%128+" "+123%128);
       System.out.println(295.04%256+" "+300%256+" "+123%256);

       /*int j=2,y=3,z=10;
        for(;j<6;j++)
        {
            y=(++y + z++);
            System.out.println(y+z);
        }

    A o=new A();
        System.out.println(str);
        System.out.println(fun());*/


       /* TreeSet<StringBuffer> t =new TreeSet<StringBuffer>();
        t.add(new StringBuffer("H"));
        t.add(new StringBuffer("A"));
        System.out.println(t);*/
    }

    static int fun()
{
        return 20;}
}
