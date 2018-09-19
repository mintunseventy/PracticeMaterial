package lenskart;

public class A {

    int x=5;

    public static void main(String[] s)
    {
        final A a1=new A();
        A a2=new A();
        //A a3=new A();
        A a3=swap(a1,a2);
        System.out.println((a1==a3)+ " " +(a1.x==a3.x));
    }

    static A swap(A x,A y)
    {
        final A z=x;
        z.x=6;

        return z;
    }
}
