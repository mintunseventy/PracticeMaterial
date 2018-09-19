package MarkerInerfaceExamples;

public class CloneableTest implements Cloneable{

    int a;

    public static void main(String args[]) throws CloneNotSupportedException
    {
        CloneableTest obj=new CloneableTest();
        CloneableTest obj1=(CloneableTest) obj.clone();
    }
}
