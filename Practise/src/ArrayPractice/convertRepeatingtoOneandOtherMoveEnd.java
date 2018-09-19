package ArrayPractice;

import java.util.Arrays;

public class convertRepeatingtoOneandOtherMoveEnd {

    public static void main(String args[])
    {

        int[] arrNum={2,3,4,2,4,5,6,7,3};
        //[1, 3, 4, 1, 4, 5, 6, 7, 3]
        convertArray(arrNum);
        String a = "1011001000100000000000000000000000000000000100000000000000000000";
        System.out.println("lenght"+a.length());

     }

    private static void convertArray(int[] arrNum) {
        // TODO Auto-generated method stub

        for(int i=0;i<arrNum.length;i++)
        {
            boolean isFound=false;
            for(int j=i+1;j<arrNum.length;j++)
            {
                if(arrNum[i]==arrNum[j])
                {
                    arrNum[i]=1;
                    arrNum[j]=1;
                    isFound=true;
                }
                if(isFound)
                    arrNum[i]=1;
            }

        }System.out.println(" Updated Values are : "+Arrays.toString(arrNum));

        int counter=arrNum.length-1;
        for(int i=arrNum.length-1;i>=0;i--)
        {
            if(arrNum[i]!=1)
            {
                arrNum[counter]=arrNum[i];
                counter--;
            }
        }
        while(counter>=0)
        { arrNum[counter]=1;
            counter--;
        }
        System.out.println(" Updated Values are : "+Arrays.toString(arrNum));
    }

}
