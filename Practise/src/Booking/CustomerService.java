package Booking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {

        List<Integer> arrival=new ArrayList<Integer>();
        List<Integer> depart=new ArrayList<Integer>();
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        for(List<Integer> list:callsTimes){
            arrival.add(list.get(0));
            depart.add(list.get(1));
        }

        Collections.sort(arrival);
        Collections.sort(depart);
        //arrival.sort();
        //depart.sort();

         while (i < arrival.size() && j < depart.size())
            {
      // If next event in sorted order is arrival,
      // increment count of platforms needed
      if (arrival.get(i) <= depart.get(j))
      {
          plat_needed++;
          i++;

          // Update result if needed
          if (plat_needed > result)
              result = plat_needed;
      }

      // Else decrement count of platforms needed
      else
      {
          plat_needed--;
          j++;
      }
   }

        if(result==noOfCurrentAgents)
            return 0;
        else
            return result-noOfCurrentAgents;

       // return 1;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int noOfCurrentAgents = Integer.parseInt(bufferedReader.readLine().trim());

        int callsTimesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int callsTimesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> callsTimes = new ArrayList<>();

        for (int i = 0; i < callsTimesRows; i++) {
            String[] callsTimesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> callsTimesRowItems = new ArrayList<>();

            for (int j = 0; j < callsTimesColumns; j++) {
                int callsTimesItem = Integer.parseInt(callsTimesRowTempItems[j]);
                callsTimesRowItems.add(callsTimesItem);
            }

            callsTimes.add(callsTimesRowItems);
        }

        int res = howManyAgentsToAdd(noOfCurrentAgents, callsTimes);
        System.out.println(res);
       /* bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }



}
