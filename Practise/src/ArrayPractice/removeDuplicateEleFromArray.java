package ArrayPractice;

import java.util.Arrays;

public class removeDuplicateEleFromArray {

    private static int[] a={1,2,1,1,2,3,1,4,2,5};

    public static void main(String args[])
    {

        int n=removeDuplicate(a);
        //System.out.println("Without Duplicates  :"+a.toString());
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }

    public static int removeDuplicate(int[] arr)
    {

        //int n=arr.length;
        Arrays.sort(arr);
        /*if (n == 0 || n == 1)
            return n;*/

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[arr.length-1];

        return j;

    }
}
