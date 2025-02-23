
import java.util.ArrayList;

public class methods {

    public static ArrayList<Double> stringToInt(ArrayList<String> ratingAsString) {
        ArrayList<Double> ratings = new ArrayList<>();
        for (int i = 0; i < ratingAsString.size(); i++) {
    
            try {
                // Attempt to parse the string as a double
                double x = Double.parseDouble(ratingAsString.get(i));
                ratings.add(x);
            } catch (NumberFormatException e) {
                // If it fails to parse, print an error message and continue
                i--;
            }
        }
        return ratings;
    }

    public static boolean checkTitle(String input, ArrayList<Movie> list) {
        if (input == null || list == null || list.isEmpty()) {
            return false;
        }
    
        String inputLower = input.toLowerCase();
    
        for (Movie movie : list) {
            String movieNameLower = movie.getMovieName().toLowerCase();
            if (movieNameLower.startsWith(inputLower)) {
                return true;
            }
        }
    
        return false;
    }

    public static Movie getMovieData(String input, ArrayList<Movie> list)
    {
        Movie x = new Movie();
        for(int i = 1; i < list.size(); i++)
        {
            if(checkTitle(input, list))
            {
                x = list.get(i);
                return x;
            }
        }
        return x;
    }

    public static boolean checkType(String a, String b)
    {
        return a.equals(b); 
    }

    public static boolean checkProtag(Movie a, Movie b)
    {
        return a.getProtag().equals(b.getProtag());
    }

    
}
