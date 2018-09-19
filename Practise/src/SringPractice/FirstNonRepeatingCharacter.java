package SringPractice;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    public static void main(String args[])
    {
        System.out.println(printFirstRepChar("intumn"));
    }

    private static Character printFirstRepChar(String string) {
        // TODO Auto-generated method stub
        Set<Character> set=new HashSet<Character>();
        char result='\0';
        for(int i=0;i<string.length();i++)
        {
            if(set.contains(string.charAt(i)))
                return string.charAt(i);
            else
                set.add(string.charAt(i));
        }
        return result;
    }

}
