package lenskart;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Theory {

    public static void main(String args[])
    {
        String s1="abc";
        String s2=s1;
        //String is Immutable in java
        s1+="d";

        System.out.println(s1+ " " +s2 +" " +(s1==s2));
        //System.out.println(s1.toUpperCase()+" "+s2);
        StringBuffer sb1=new StringBuffer("abc");
        StringBuffer sb2=sb1;
        sb1.append("d");
        System.out.println(sb1+ " " +sb2 +" " +(sb1==sb2));
        before();


    }


    public static void before()
    {
        Set set =new TreeSet();
        set.add("2");
        set.add("3");
        set.add("1");
        Iterator it=set.iterator();
        while(it.hasNext())
            System.out.println(it.next());


    }
}
