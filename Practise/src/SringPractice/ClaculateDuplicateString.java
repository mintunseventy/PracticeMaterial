package SringPractice;

import java.util.HashMap;
import java.util.Map;

public class ClaculateDuplicateString {
    public static void main(String args[]) {
        String input = "mintusinghuh";
        printduplicateString(input);
    }

    private static void printduplicateString(String input)
    {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<input.length();i++)
        {
            if(map.containsKey(input.charAt(i)))
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            else
                map.put(input.charAt(i),1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }

    }
}
