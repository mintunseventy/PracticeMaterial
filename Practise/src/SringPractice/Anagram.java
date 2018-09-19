package SringPractice;

import java.util.HashMap;
import java.util.Map;

//Ananagram of 2 string is string containing same letters like 'ARMY' & 'MARY'
public class Anagram {

    public static void main(String args[]) {
        System.out.println("Anagram is:" + inAnagramWithoutList("WMARMYY", "WMARMYY"));
    }

    private static boolean isAnagram(String string1, String string2) {
        // TODO Auto-generated method stub
        boolean isAnagram = true;
        if (string1.length() != string2.length())
            return false;

        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < string1.length(); i++) {
            if (map1.containsKey(string1.charAt(i)))
                map1.put(string1.charAt(i), map1.get(string1.charAt(i)) + 1);
            else
                map1.put(string1.charAt(i), 1);
        }

        for (int i = 0; i < string2.length(); i++) {
            if (map2.containsKey(string1.charAt(i)))
                map2.put(string1.charAt(i), map2.get(string1.charAt(i)) + 1);
            else
                map2.put(string1.charAt(i), 1);
        }

        for (int i = 0; i < string1.length(); i++) {
            if (map1.get(string1.charAt(i)).equals(map2.get(string2.charAt(i)))) {
                map2.remove(string2.charAt(i));
            }
        }

        if (!map2.keySet().isEmpty())
            isAnagram = false;

        return isAnagram;

    }

    private static boolean inAnagramWithoutList(String string1,String string2)
    {

        boolean result = true;

        string1=string1.replace("\\s", "");
        string2=string2.replace("\\s", "");
        char[] str1char=string1.toCharArray();

        for(char c:str1char)
        {
            int index=string2.indexOf(c);
            if(index!=-1)
            {
                string2 = string2.substring(0, index)+string2.substring(index+1,string2.length());
            }
            else
            {
                result =false;
                break;
            }
        }
        return result;

    }
}
