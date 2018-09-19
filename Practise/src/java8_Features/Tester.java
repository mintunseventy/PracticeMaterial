package java8_Features;

interface Colorable {}
class Vehicle {}
class Car extends Vehicle implements Colorable {}
public class Tester {
    public static void main(String[] args) {
        Vehicle a = new Car();
        Colorable i = (Colorable) a; //Line 1
        Vehicle b = new Vehicle();
       Colorable j = (Colorable) b;  //Line 2
    }
}