package ArrayPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import linkedList.AlterSplitting;

public class SortByFrequency {

    AlterSplitting o=new AlterSplitting();
    static void sortFrequency(int[] arr)
    {


        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }

       List<Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
      // Iterator<Entry<Integer, Integer>> itr=list.iterator();

        /*Collections.sort(list,new Comparator<Entry<Integer,Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                // TODO Auto-generated method stub
                return o2.getValue().compareTo(o1.getValue());
            }

        });
*/
        Collections.sort(list,new SortByKey());
        System.out.println("HEllo");
    }

    public static void main(String args[])
    {
        int[] input={1,2,3,4,3,2,1,6,7,8};
        sortFrequency(input);
    }

}
