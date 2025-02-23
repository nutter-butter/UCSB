

import java.util.ArrayList;

public class methods {

    public static boolean inDatabase(String input, ArrayList<Movie> list) {
        String inputLower = input.toLowerCase();
    
        for (Movie movie : list) {
            String movieNameLower = movie.getMovieName().toLowerCase();
            if (movieNameLower.equalsIgnoreCase(inputLower)) {
                return true;
            }
        }   
        return false;
    }

    public static boolean closeToAnother(String input, ArrayList<Movie> list)
    {
        String inputlower = input.toLowerCase();
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMovieName().toLowerCase().contains(inputlower))
            {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Movie> closeToAnotherArray(String a, ArrayList<Movie> list)
    {
        ArrayList<Movie> possibleMovies = new ArrayList<>();
        System.out.println("Is one of the following your Movie?");
        String aLowerCase = a.toLowerCase();
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMovieName().toLowerCase().contains(aLowerCase))
            {
                possibleMovies.add(list.get(i));
            }
        }
        return possibleMovies;
    }

    public static Movie getMovieData(String input, ArrayList<Movie> list)
    {
        Movie x = new Movie();
        for(int i = 1; i < list.size(); i++)
        {
            if(input.equalsIgnoreCase(list.get(i).getMovieName()))
            {
                x = list.get(i);
                return x;
            }
        }
        return x;
    }

    public static boolean checkType(String a, String b)
    {
        return (a.equals(b));
    }

    public static boolean checkProtag(Movie a, Movie b)
    {
        return a.getProtag().equals(b.getProtag());
    }

    public static boolean checkDirector(Movie a, Movie b)
    {
        return a.getDirector().equals(b.getDirector());
    }

    public static boolean checkRating(Movie a, Movie b)
    {
        return a.getRating().equals(b.getRating());
    }

    public static String getFirstWords(String a)
    {
        String[] word = a.split("\\s+");
        if (word.length < 2) {
            return word[0];
        }
        return word[0] + " " + word[1];
    }

    public static boolean checkIfSeries(String a, String b)
    {
        String aLower = a.toLowerCase();
        String bLower = a.toLowerCase();

        if(bLower.contains(getFirstWords(aLower)))
        {
            return true;
        }
        return false;
    }
}
