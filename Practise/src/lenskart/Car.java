package lenskart;

public class Car extends Vehicle{
    public final void start()
    {
        System.out.println("Car started");
    }

    @Override
    public void start1()
    {
        System.out.println("Car start1");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new Car().start();

        Vehicle v=new Vehicle();
        v.start1();

    }

}
