package SringPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//If string is "Java is great" then output is "avaJ si taerg"
public class reverseWords {

    public static void main(String args[])
    {
        String input="Java is great";
        System.out.println("Reverse of the String using Library is :  "+getReverseStringUsingLibrary(input));
        System.out.println("Reverse of the String without using Library is :  "+getReverseString(input));
        System.out.println("Reverse of the String without using Library is :  "+getIndividualReverseString(input));

    }

    private static String getReverseStringUsingLibrary(String input)
    {

        List<String> list=Arrays.asList(input.split("\\s+"));
        Collections.reverse(list);

        StringBuffer sb=new StringBuffer();
        for(String str:list)
        {
            sb.append(str+" ");
        }
        return sb.toString();
    }

    private static String getReverseString(String input)
    {

        List<String> list=Arrays.asList(input.split("\\s+"));
        StringBuffer sb=new StringBuffer();
        for(int i=list.size()-1;i>=0;i--)
        {
            sb.append(list.get(i)+" ");
        }
        return sb.toString();
    }


    private static String getIndividualReverseString(String input)
    {
        List<String> ls=Arrays.asList(input.split("\\s"));
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<ls.size();i++)
        {   char[] ch=ls.get(i).toCharArray();
            for(int j=ch.length-1;j>=0;j--)
                sb.append(ch[j]);
            sb.append(" ");
        }

        return sb.toString();

    }
}
