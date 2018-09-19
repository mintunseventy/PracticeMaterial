package ArrayPractice;

public class findCommonInThreeSortedArrays {

    private static int a[]={1,2,1,2,5,8,9,16};

    public static void main(String args[])
    {
        int ar1[] = {1, 5, 10, -15, 40, 60};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommon(ar1,ar2,ar3);


    }

    private static void findCommon(int[] ar1, int[] ar2, int[] ar3) {
        int i=0;
        int j=0;
        int k=0;
        while(i<ar1.length && j<ar2.length && k<ar3.length)
        {
            if(ar1[i]==ar2[j] && ar2[j]==ar3[k])
            {
                System.out.println(ar1[i]);
                i++;
                j++;
                k++;
            }
            else if(ar1[i]<ar2[j])
            i++;
            else if(ar2[j]<ar3[k])
                j++;
            else
                k++;
        }
    }
}
