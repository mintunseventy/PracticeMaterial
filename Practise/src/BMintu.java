
public class BMintu extends A{

    BMintu()
    {
        this("yo");
        int b=0;
        //b=a;
    }
    BMintu(String a)
    {
        System.out.println("hello");
    }
    @Override
    public BMintu getObj()
    {
        System.out.println("yo");
        return new BMintu();



    }

    public static void main(String args[])
    {
        A obj=new BMintu();
        obj.getObj();

    }
}
