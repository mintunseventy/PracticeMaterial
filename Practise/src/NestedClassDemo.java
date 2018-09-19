
public class NestedClassDemo {

    private int c=10;
    static int d=10;
    static class Nested{


        private static int a=10;
        void display()
        {


            System.out.println("emthod in static"+d);

        }

        static void display2()
        {

        }

    }

    class inner
    {
        void innerDisplay()
        {
            method();
            c=10;
            System.out.println(c);
        }


    }

    void method()
    {
        Nested obj=new Nested();
        obj.display();
        System.out.println(Nested.a);
        Nested.display2();
        inner obj1=new inner();
        obj1.innerDisplay();
    }
}
