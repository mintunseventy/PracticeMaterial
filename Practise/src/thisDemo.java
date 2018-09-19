
public class thisDemo {

    final int a,b,d=9;
    final static int c;
    static{
        c=10;
    }
    public thisDemo() {
        // TODO Auto-generated constructor stub
       // System.out.println("Hello");
        this(20,30);

    }

    public thisDemo(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
     static void disp()
    {

    }

  private  void display1()
    {
        System.out.println("Display1");
        this.display2();
    }

  private   void display2()
    {
        System.out.println("Display2");

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        thisDemo td=new thisDemo();
        System.out.println(td.a+ " " + td.b);
        int a1[]=new int[20];
        int[] a2=new int[20];
        thisDemo[] obj=new thisDemo[20];
        System.out.println("Heoomo");
        final int a;

    }

}
