package ArrayPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayInGroup {

    private static void reverseGroup(int[] arr,int size)
    {
        List<List<Integer>> listOfList=new ArrayList<List<Integer>>();
        int count=0;
        while(count<arr.length)
        {
            List<Integer> tempList=new ArrayList<Integer>();
            int i=0;
            while(i<size && count<arr.length)
            {
                tempList.add(arr[count]);
                count++;
                i++;
            }
            listOfList.add(tempList);

        }

        int index=0;
        for(List<Integer> tempList:listOfList)
        {
            for(int i=tempList.size()-1;i>=0;i--)
                {
                    arr[index]=tempList.get(i);
                    index++;
                }
        }

        System.out.println(arr);
    }

    public static void main(String args[])
    {
        int[] input={1,2,3,4,5,6,7,8};
        reverseGroup(input,3);
    }

}
