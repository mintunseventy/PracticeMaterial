package DeutcheBank;

class Sub
{
    public static Integer num=10;

    Sub()
    {
        num=num+1;
    }
}

class superClass
{
    public int i=0;
    superClass()
    {

    }
    public superClass(String text)
    {
        i=1;
    }
}

class subClass extends superClass
{

    public subClass(String text) {
        //super(text);
        // TODO Auto-generated constructor stub
        i=2;
    }

}


class Two
{
    byte x;
}

class TestA
{
    public void start()
    {
        System.out.println("TestA");
    }
}
class TestB extends TestA
{
    public void start()
    {
        System.out.println("TestB");
    }
}
public class TestExamples {
    static int arr[]=new int[10];
    int a;int b;
    void meth(int i,int j)
    {
        i*=2;
        j/=2;
    }


    public static void main(String args[])
    {

        question12();
        /*question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question10();
        question11();
        question12();
        question13();*/
    }

    static void  question1()
    {

        int a=20;
        int x=a++%5;
        int y=++a%5;
        System.out.println(x+" "+y);
        System.out.println(0.1*3);
        System.out.println(0.1*3!=0.3);
    }

    static void question2()
    {
        Sub s1=new Sub();
        Sub s2=new Sub();
        Sub s3=new Sub();
        System.out.println(s1.num+s2.num+s3.num);
    }

    static void question3()
    {
        int x=0;
        int y=0;
        for(int z=0;z<5;z++)
        {
            if((++x>2)&&(++y>2))
            {
                x++;
            }
        }
        System.out.println(x+" "+y);
    }

    static Object question4()
    {
        Object o=new Float(3.14F);
        Object[] oa=new Object[1];
        oa[0]=o;
        o=null;
        oa[0]=null;
        return o;

    }

    static void question5()
    {
        System.out.println(arr[4]);
    }

    static void question6()
    {
       ((TestA)new TestB()).start();
      // ((TestB)new TestB()).start();
     //  ((TestB)new TestA()).start();
    }

    static void question7()
    {
        StringBuffer a=new StringBuffer("DBOI");
        StringBuffer b=new StringBuffer("BANGALORE");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }

    static void question8()
    {
        TestExamples p=new TestExamples();
        p.start();
    }
    static void start()
    {
        Two t=new Two();
        System.out.println(t.x+" ");
        Two t2=fix(t);
        System.out.println(t.x+" "+t2.x);
    }
    static Two fix(Two tt)
    {
        tt.x=42;
        return tt;
    }

    static void question10()
    {

        int x=-5,y=2,z=0,m;
        m=++x|++y&++z;
        System.out.println(x+" "+y+" "+z+" "+m);
    }

    static void question11()
    {
        TestExamples obj=new TestExamples();
        int a=10;
        int b=20;
        obj.meth(a, b);
        System.out.println(a+" "+b);
    }

    static void question12()
    {
        boolean flag=false;
        try
        {
            if(flag)
            {
                while(true)
                {

                }
            }else
            {
                System.exit(1);
            }
        }finally{
            System.out.println("In finally");
        }
    }

    /*public int aMethod()
    {
        static int i=0;
        i++;
        return i;
    }
*/
    static void question13()
    {
        // static int i=0; we cannot have local static variable it should be a class variable
    }

    void test()
    {

    }
}
