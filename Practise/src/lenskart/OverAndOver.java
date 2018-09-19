package lenskart;

public class OverAndOver {
static String s="";
public static void main(String[] args)
{
    /*try
    {*/try
    {
        s+="1";
        throw new Exception();
    }
    catch(Exception e)
    {
        s+="2";

    }
    finally{
        s+="3";
       doStuff();
        s+="4";
    }/*}
    catch(Exception e)
    {
        System.out.println("Indsie Outer Catch");
    }
    finally
    {
        System.out.println("inside finnaly");
    }*/

    System.out.println(s);
}
private static void doStuff() {
    // TODO Auto-generated method stub
    int x=0;
    int y=7/x;

}
}
