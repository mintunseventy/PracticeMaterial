package java8_Features;

public class Test extends Thread {
    public void run() {
        System.out.println("Hack");
    }
    public void run(String s) {
        System.out.println("Build");
    }
    public static void main(String[] args) {
        new Test().start();
    }
}
