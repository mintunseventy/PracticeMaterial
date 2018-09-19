
public class CallingNestedClass {

    void demo()
    {
        NestedClassDemo.Nested obj=new NestedClassDemo.Nested();
        obj.display();
        NestedClassDemo.Nested.display2();
        NestedClassDemo obj2=new NestedClassDemo();
        NestedClassDemo.inner obj1=obj2.new inner();
        obj1.innerDisplay();

    }

    void test()
    {
        String str1="ABACD";
        String str2="CDABA";
        String str3=str1+str1;
        if(str3.indexOf(str3)!=-1)
        {

        }

    }
}
