
public class A {

    protected int a;
    static int b=28;
    final int fv;
    final int fv2=33;
    static final int k;
    static{
        k=20;
    }
    A()
    {
     fv=10;
    }
    A(String str)
    {
        fv=20;
    }

    /*{
        fv=20;

    }*/
    public A getObj()
    {
        return new A();
    }

    static void display()
    {
        //static int b=28;

        b=10;

        System.out.println(" static");
    }

    void display2()
    {
        //static int b=28;
        b=10;
        this.display();

        System.out.println("Non static");
    }
    static void static2methoid()
    {
        System.out.println("mehtod 2");

        display();
        A obj=new A();
        obj.display2();
    }
    public static void main(String args[])
    {
        final byte a=10;
        final byte b =20;
        byte d=a+b;
        byte c=(byte)(a+b);
        display();
        A obj=new A();
        A.display();
        //obj.display2();
        final StringBuffer sb=new StringBuffer();
        sb.append("string");
        sb.append("mintu");
        StringBuffer sb2=new StringBuffer("hemmo");
        StringBuffer sb3=new StringBuffer("mintu");
        sb2=sb3;
        //sb=sb3;
        final int i;
        i=20;
        //k=39;

    }

}
