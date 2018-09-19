package java8_Features;

public class TestClass1 implements intefaceWithDefualtMethod, functionalInterface{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        functionalInterface g=()->System.out.println("hello");
    }

    @Override
    public void max() {
        // TODO Auto-generated method stub

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        intefaceWithDefualtMethod.super.display();
    }

    @Override
    public void display1() {
        // TODO Auto-generated method stub

    }

}
