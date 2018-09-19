package ArrayPractice;

import lenskart.Alpha;

public class ArmstrongNumber extends Alpha {
    protected int a=10;
  protected  ArmstrongNumber()
    {
      s+="hello";
    }
    public static void main(String args[])
    {
        System.out.println("The armstrong of number is  :: "+getArmstrongNumber("153"));
    }

    private static boolean getArmstrongNumber(String string) {
        // TODO Auto-generated method stub
        char[] ch=string.toCharArray();
        int sum=0;
        for(char c : ch)
        {
           sum= (int) (sum + Math.pow(Integer.parseInt(String.valueOf(c)), string.length()));

        }
        String result=String.valueOf(sum);
        if(result.equals(string))
        return true;
        return false;
    }
}
