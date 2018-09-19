package mahattanAssociates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class B {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a[]={1,2,2};
        System.out.println("outout"+getMinimum(a));

    }

    static int getMinimum(int[] arr)
    {
        //Set<Integer> set=new TreeSet<Integer>();
      //  Map<K, V>
        Set<Integer> set=new HashSet<Integer>();
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int temp=arr[i];
                while(map.containsKey(temp))
                    temp++;
                map.put(temp, 1);

            }else
                map.put(arr[i], 1);
        }

        List<Integer> list=new ArrayList<>(map.keySet());
               Iterator itr1=list.iterator();
        int sum=0;
        while(itr1.hasNext())
            sum=sum+(int) itr1.next();


        return sum;
    }

}
