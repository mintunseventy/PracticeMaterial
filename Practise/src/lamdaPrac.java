import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamdaPrac extends TestAbstract{

    public static void main(String args[])
    {
        List<String> string=Arrays.asList("This","is","my","first","lamda","implementation");
        List<String> sortedString = string.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedString);
        System.out.println(string.stream().sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.toList()));
        TestAbstract.display();
       // TestAbstract obj=new TestAbstract();

    }

    @Override
    public void display2() {
        // TODO Auto-generated method stub

    }

}
