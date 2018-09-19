package lenskart;

public class Test {


    public static void main(String args[])
    {
        new Test().go();
    }

    private void go() {
        // TODO Auto-generated method stub
        Mammal m=new Zebra();

        System.out.println(m.name+m.makeNoise());


       /* Mammal m1=new Mammal();
        System.out.println(m1.name+m1.makeNoise());

        Zebra m2=new Zebra();
        System.out.println(m2.name+m2.makeNoise());
*/

    }


}
