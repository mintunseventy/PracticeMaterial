package stackAndQueue;

import java.util.Scanner;

public class LRU {


  static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Integer sum=0;
        String input=s.next();
        char[] ch=input.toCharArray();
        for(char c:ch)
        {
            if(Character.isDigit(c))
            {
                sum=sum+Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }

}
