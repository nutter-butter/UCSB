

import java.util.ArrayList;

public class methods {

    public static boolean inDatabase(String input, ArrayList<Movie> list) { // Iteraties Through ArrayList list to find if 
                                                                            // String input is in the ArrayList list
        for (int i = 0; i < list.size(); i++) {                                          // Returns true if input is in list
            if (list.get(i).getMovieName().equalsIgnoreCase(input)) {
                return true;
            }
        }   
        return false;
    }

    public static boolean closeToAnother(String input, ArrayList<Movie> list) // Checks if input is within another elemnent of list
    {                                                                         // Returns true if it is
        String inputlower = input.toLowerCase(); 
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getMovieName().toLowerCase().contains(inputlower)) //Checks if string is within list
            {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Movie> closeToAnotherArray(String a, ArrayList<Movie> list) 
    {
        ArrayList<Movie> possibleMovies = new ArrayList<>();                       //creates empty arraylist of movies
        System.out.println("Is one of the following your Movie?"); 
        String aLowerCase = a.toLowerCase();
        for(int i = 0; i < list.size(); i++) 
        {
            if(list.get(i).getMovieName().toLowerCase().contains(aLowerCase))      //checks if String is within movie title
            {
                possibleMovies.add(list.get(i));                                   //adds movie to possibleMovies List
            }
        }
        return possibleMovies; 
    }

    public static Movie getMovieData(String input, ArrayList<Movie> list)
    {
        Movie x = new Movie();
        for(int i = 1; i < list.size(); i++)
        {
            if(input.equalsIgnoreCase(list.get(i).getMovieName())) //Checks if movie name in list equals movie name given
            {
                x = list.get(i); //sets x to that movie
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
        String[] word = a.split("\\s+"); // Splits words by whitespace
        if (word.length < 2) {                 // If there are less than 2 words only returns first word
            return word[0];
        }
        return word[0] + " " + word[1]; //returns first 2 words
    }

    public static boolean checkIfSeries(String a, String b)
    {
        String aLower = a.toLowerCase();
        String bLower = a.toLowerCase();

        if(bLower.contains(getFirstWords(aLower))) // If movie name also has the first two words of given movie name
        {                                          // returns true = they are part of same series
            return true;                           // not perfect test but words for most movie titles
        }
        return false;
    }
}
