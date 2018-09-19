package lamdaNStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class TestComparator {

    public static void main(String args[])
    {
        List<employee> emplist=Arrays.asList(new employee("mint", 13),new employee("sint", 13),new employee("chand", 11),new employee("mintus", 322));
        List<employee> emplist1=Arrays.asList(new employee("mint", 13),new employee("sint", 13),new employee("chand", 11));
        //sortingObject(emplist, emplist1);
        //printMap();
        //printList();
        //filterExamples(emplist);
        //filterExamples1(emplist);
        //filterExamples2(emplist);
        filterExamples3(emplist);
    }

    private static void sortingObject(List<employee> emplist, List<employee> emplist1) {
        /*Collections.sort(emplist,new Comparator<employee>() {
        @Override
        public
        int compare( employee e1,employee e2)
        {
            return e1.getName().compareTo(e2.getName());
        }
    });

    Iterator<employee> itr=emplist.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    for(employee e:emplist)
    {
        System.out.println(e);
    }*/

        emplist.forEach(e->System.out.println(e));
       // emplist1.sort((employee e1,employee e2)->e1.getName().compareTo(e2.getName()));
        emplist1.sort((a,b)->a.getName().compareTo(b.getName()));
        emplist1.forEach(e->System.out.println(e));
        Collections.sort(emplist,(employee e1,employee e2)->e1.getName().compareTo(e2.getName()));
    }

   static void printMap()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("mintu", 2);
        map.put("sintu", 12);
        map.put("chanda", 1);

        map.forEach((K,V)->System.out.println("key "+K+" balue :"+V));
        List<Entry<String , Integer>> list=new ArrayList<Entry<String , Integer>>(map.entrySet());
        Set<Entry<String , Integer>> set=map.entrySet();
       // Set<Entry<String , Integer>> set1=new HashSet<>(list);

        list.sort((Entry<String,Integer> e1,Entry<String,Integer> e2)-> e1.getValue().compareTo(e2.getValue()));
        list.forEach(l->System.out.println(l));

        for(Entry<String, Integer> e:map.entrySet())
        {

        }

        for(Entry<String, Integer> entry:list)
        {
            entry.getValue();
        }

        Iterator<Entry<String,Integer>> itr=set.iterator();
        while(itr.hasNext())
        {
            Entry<String,Integer> entry=itr.next();
            entry.getKey();
            entry.getValue();
        }
     }


   static void printList()
   {
      List<Integer> lists=Arrays.asList(1,2,3,4,5,6,7);
      lists.forEach(list->
      {
         if(4!=list)
             System.out.println(list);
      });
   }

   //filter method
   static void filterExamples(List<employee> emplist)
   {
       List<employee> filteredList=emplist.stream().filter(e->!e.getName().contains("mintus")).collect(Collectors.toList());
       filteredList.forEach(e->System.out.println(e));

   }

   //filter method findAny(to get a specific person) or Else(return null)
   static void filterExamples1(List<employee> emplist)
   {
       employee filteredList=emplist.stream().filter(e->e.getName().contains("mintus") && e.getAge()==32).findAny().orElse(null);
       System.out.println(filteredList);

   }

   // method map
   static void filterExamples2(List<employee> emplist)
   {
       List<String> collectName=emplist.stream().map(employee::getName).collect(Collectors.toList());
       collectName.forEach(name->System.out.println(name));
       //or we can also use
       List<Integer> collectAge=emplist.stream().map(x->x.getAge()).collect(Collectors.toList());
       collectAge.forEach(c->System.out.println(c));
   }

   //map to convert one object to another
   static void filterExamples3(List<employee> emplist)
   {
       List<employee2> emp2= emplist.stream().map(emp->
       {
          employee2 temp=new employee2();
         temp.setName(emp.getName());
         if(emp.getName().equals("mintus"))
             temp.setAddress("sarab bhatti");
         return temp;

       }).collect(Collectors.toList());
       emp2.forEach(emp->System.out.println(emp));
   }


}
