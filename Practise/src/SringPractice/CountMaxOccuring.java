package SringPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMaxOccuring {

    public static void main(String args[])
    {
        //Scanner s=new Scanner(System.in);
       // String name = s.nextLine();
        //System.out.println("Max occuring character is :"+getMaxOccuringCharNew(name));;
        //System.out.println("second max Occuring character is:"+getSecondMostFreqChar(name));
        System.out.println("No of words are  :"+wordCount("mitu sintu hello"));
        int test='c'-'a';
        System.out.println(" Test "+test);

    }
    public static int wordCount(String input)
    {
        int wc=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==' '||input.charAt(i)=='\n'||input.charAt('i')=='\t')
                wc++;
        }
        return wc;
    }

    private static char getMaxOccuringCharNew(String name)
    {
        int count[]=new int[256];
        for(int i=0;i<name.length();i++)
        {
            count[name.charAt(i)]++;
        }
        int max=-1;
        char result='\0';
        for(int i=0;i<name.length();i++)
        {

            if(max<count[name.charAt(i)])
            {
                max=count[name.charAt(i)];
                result=name.charAt(i);
            }
        }

        return  result;
    }

    private static char getSecondMostFreqChar(String name)
    {
        int[] count = new int[256];
        int i;
        for (i=0; i< name.length(); i++)
            (count[name.charAt(i)])++;

        // Traverse through the count[] and find
        // second highest element.
        int first = 0, second = 0;
        for (i = 0; i < 256; i++)
        {
            /* If current element is smaller than
            first then update both first and second */
            if (count[i] > count[first])
            {
                second = first;
                first = i;
            }
/*
             If count[i] is in between first and
            second then update second
            else if (count[i] > count[second] &&
                     count[i] != count[first])
                second = i;
*/        }

        return (char)second;
    }

    private static char getMaxOccuringChar(String name) {
        // TODO Auto-generated method stub
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<name.length();i++)
        {
            if(null!=map.get(name.charAt(i)))
                map.put(name.charAt(i), map.get(name.charAt(i))+1);
            else
                map.put(name.charAt(i),1);
        }
        return getMaxCharFromMAp(map);
    }

    private static char getMaxCharFromMAp(Map<Character, Integer> map) {
        // TODO Auto-generated method stub
        int max=0;
        char output='\0';
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
           if( entry.getValue() > max)
           {
               max=entry.getValue();
               output=entry.getKey();
           }
        }
        return output;
    }
}
