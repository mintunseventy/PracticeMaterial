import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class LongestDistinctSubString {

    int a,b;
    public LongestDistinctSubString() {

        // TODO Auto-generated constructor stub
        this.a=10;
        this.b=120;
    }

    static void display()
    {

    }

    @Override
    public String toString()
    {
        return (a+" "+b);
    }

    public static void main(String args[]) {
        /*String input = "javaconceptoftheday";
        System.out.println(getSubString(input));
        Map<Integer,ArrayList<Character>> map=new TreeMap<Integer,ArrayList<Character>>();
        Map<Integer,char[]> map1=new HashMap<Integer,char[]>();
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<Integer>();*/
        LongestDistinctSubString obj=new LongestDistinctSubString();
        System.out.println(obj.toString());
        obj.display();
        LongestDistinctSubString.display();

    }

    private static String getSubString(String inputString) {
        // Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        // Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        // Creating LinkedHashMap with characters as keys and their position as values.

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        // Iterating through charArray

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            // If ch is not present in charPosMap, adding ch into charPosMap along with its position

            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }

            // If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap

            else {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            // Updating longestSubstring and longestSubstringLength

            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();

                longestSubstring = charPosMap.keySet().toString();
            }
        }

        return longestSubstring;
    }

}
