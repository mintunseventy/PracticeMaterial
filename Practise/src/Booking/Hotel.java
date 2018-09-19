package Booking;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
public class Hotel {

   /* static List<Integer> sort_hotels(String keywords, List<Integer> hotel_ids, List<String> reviews) {

        List<String> keywordList=Arrays.asList(keywords.split(" "));
        Map<Integer,Integer> idAndCount=new HashMap<Integer,Integer>();
        int count = 0;
        for(Integer id:hotel_ids)
        {
            for(String word:reviews)
            {
                if(keywordList.contains(word.split(" ")))
                {
                    if(null==idAndCount.get(id))
                        idAndCount.put(id, 1);
                    else
                        idAndCount.put(id,idAndCount.get(id)+1);
                }
            }
        }

        return null;
    }*/

    static List<Integer> sort_hotels(String keywords, List<Integer> hotel_ids, List<String> reviews) {

        List<String> keywordList=Arrays.asList(keywords.split(" "));
        Map<Integer,Integer> idAndCount=new HashMap<Integer,Integer>();
        for(int i=0;i<hotel_ids.size();i++)
        {
            List<String> review = Arrays.asList(reviews.get(i).split(" "));
            for(String checkReview:review)
            {
                if(keywordList.contains(checkReview))
                {
                    if(null==idAndCount.get(hotel_ids.get(i)))
                        idAndCount.put(hotel_ids.get(i), 1);
                    else
                        idAndCount.put(hotel_ids.get(i),idAndCount.get(hotel_ids.get(i))+1);
                }
            }
        }
        List<Entry<Integer,Integer>> list=new ArrayList<>(idAndCount.entrySet());
        Collections.sort(list,new Comparator<Entry<Integer,Integer>>() {

        @Override
        public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
            // TODO Auto-generated method stub
            return o2.getValue().compareTo(o1.getValue());
        }

    });

        List<Integer> finalList=new ArrayList<>();
        for(Entry<Integer,Integer> entry:list)
        {
            finalList.add(entry.getKey());
        }

        return finalList;
    }

      public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String keywords = bufferedReader.readLine();

        int hotel_idsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> hotel_idsTemp = new ArrayList<>();

        IntStream.range(0, hotel_idsCount).forEach(i -> {
            try {
                hotel_idsTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> hotel_ids = hotel_idsTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int reviewsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> reviews = new ArrayList<>();

        IntStream.range(0, reviewsCount).forEach(i -> {
            try {
                reviews.add(bufferedReader.readLine());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> res = sort_hotels(keywords, hotel_ids, reviews);

       /* bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );*/

        bufferedReader.close();
       // bufferedWriter.close();
    }
}