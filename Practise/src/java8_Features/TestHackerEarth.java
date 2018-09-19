package java8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestHackerEarth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int i = 0;
        while (i < testCase) {
            List<Integer> list = new ArrayList<>();
            int size = sc.nextInt();
            // String array=sc.nextLine();
            for (int z = 0; z < size; z++) {
                list.add(sc.nextInt());
            }
            int remove = sc.nextInt();
            rearrange(size,list,remove);
            i++;

        }*/
        List<Integer> list=Arrays.asList(22,1,34,54,22,1);
        rearrange(4,list,22);
    }

    static void rearrange(int size, List<Integer> list, int remove) {

        // int[] arrnew=Arrays.stream(arr).filter((a)->if(a%remove!=0) return a else return 1).collect(toarray(int[]));
        List<Integer> newList = list.stream().filter(a -> a%remove!=0).collect(Collectors.toList());
       // List<Integer> newList1=newList.stream().filter(a->a!=1).collect(Collectors.toList());

        int listsize=newList.size();
        int diff=list.size()-listsize;
        List<Integer> display=new ArrayList<>();
        for(int i=0;i<diff;i++)
            display.add(1);
        /*for(int i=0;i<newList.size();i++)
            display.add(newList.get(i));*/
        display.addAll(newList);
        /*display.forEach(System.out::println);
        List<Integer> finalList=new ArrayList<Integer>();
        ListIterator<Integer> listItr=list.listIterator();
        while(listItr.hasNext())
        {
            if(listItr.next()==remove)
                listItr.set(1);
        }
       // int count=0;
        for(Integer i:list)
        {
            if(i.equals(1))
                finalList.add(1);
        }
        for(int i=0;i<count;i++)
            finalList.add(1);
        for(Integer i:list)
        {
            if(i!=1)
                finalList.add(i);
        }*/

        display.forEach(l->System.out.println());

    }

}
