import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        TestClass obj=new TestClass();
        System.out.println(obj.calBlock(name));
        byte a = 1;


        // Write your code here

    }

    public int calBlock(String input)
    {
        List<Integer> cal=new ArrayList<Integer>();
        int tempCalc=1;
        int finalCal=0;
        for(int i=1;i<input.length();i++)
        {
            if((input.charAt(i-1)!=(input.charAt(i))))
            {
                cal.clear();
                tempCalc=0;
            }
            tempCalc++;
            if(finalCal<tempCalc)
            finalCal=tempCalc;
        }
        return finalCal;
    }
}
