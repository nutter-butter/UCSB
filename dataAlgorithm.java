
import java.util.*;

public class dataAlgorithm 
{
    public static HashMap<String, Integer> valueGenerator(Movie input, ArrayList<Movie> list)
    {
        HashMap<String, Integer> nameMapScore = new HashMap<>();
        String name;
        int score;

        String bestDirector = input.getDirector(); // 4pt
        String bestCountry = input.getCountry(); // 2pt
        String bestProtag = input.getProtag(); // 3pt
        String bestRating = input.getRating(); // 5pt


        for(int i = 0; i < list.size(); i++)
        {
            score = 0;
            if(list.get(i).getDirector().equals(bestDirector))
            {
                score += 4;
            }
            if(list.get(i).getCountry().equals(bestCountry))
            {
                score += 2;
            }
            if(list.get(i).getRating().equals(bestRating))
            {
                score += 3;
            }
            if(list.get(i).getProtag().equals(bestProtag))
            {
                score += 4;
            }
            if(methods.checkIfSeries(input.getMovieName(), list.get(i).getMovieName()))
            {
                score +=6;
            }
            name = list.get(i).getMovieName();
            nameMapScore.put(name, score);
        }
        return nameMapScore;
    }

    public static List<String> sortDescending(HashMap<String, Integer> map) 
    {
        // Create a list from the map's entry set
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        
        // Sort the list by values using a comparator
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        // Extract the keys from the sorted list of entries
        List<String> sortedKeys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedKeys.add(entry.getKey());
        }
        
        return sortedKeys;
    }
}