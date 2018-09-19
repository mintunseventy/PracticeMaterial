
public class superDemo extends StaticExcamples{
    int a=20;

    superDemo()
    {
        super(10);
        System.out.println("Inside superDemo cons");
    }
    @Override
    void display1()
    {
        System.out.println("superDemo");
       // System.out.println(super.a);
       // super.display1();

    }

    public static void main(String args[])
    {
        StaticExcamples sd=new superDemo();
        System.out.println(sd.a);
        sd.display1();
    }

}
