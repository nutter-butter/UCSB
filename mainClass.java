
import java.util.*;

public class mainClass 
{
    public static void main(String[] args) 
    {
        String data = "src/netflix_titles.csv";

        csvReader titles = new csvReader(data, 2);
        ArrayList<String> titlesList = titles.getColumn();

        csvReader directors = new csvReader(data, 3);
        ArrayList<String> directorsList = directors.getColumn();

        csvReader country = new csvReader(data, 5);
        ArrayList<String> countriesList = country.getColumn();

        csvReader ratings = new csvReader(data, 8);
        ArrayList<String> ratingsList = ratings.getColumn();

        csvReader duration = new csvReader(data, 9);
        ArrayList<String> durationL = duration.getColumn();
        ArrayList<String> durationList = duration.createListSpace(durationL);

        csvReader descriptions = new csvReader(data, 11);
        ArrayList<String> descsList = descriptions.getColumn();

        csvReader protags = new csvReader(data, 4);
        ArrayList<String> protagsL =  protags.getColumn();
        ArrayList<String> protagsList = protags.createList(protagsL);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Movie> movieList = new ArrayList<>();
        ArrayList<Movie> possibleMovie1;
        HashMap<String, Integer> x = new HashMap<>();
        String movieName;

            for (int i = 0; i < durationList.size(); i++) { 
                Movie newMovieA = new Movie(
                    titlesList.get(i), 
                    countriesList.get(i), 
                    ratingsList.get(i), 
                    directorsList.get(i), 
                    protagsList.get(i), 
                    descsList.get(i));
                    movieList.add(newMovieA);
            } 
                
        System.out.print("Enter your movie name: ");
        movieName = scanner.nextLine();
        Movie input = new Movie();
        Movie pH;

    if(methods.inDatabase(movieName, movieList))
        {
           for(int i = 0; i < movieList.size(); i++)
            {
                input = methods.getMovieData(movieName, movieList);
            }

            System.out.println("Your Movie is: " + input.getMovieName() + " by Director " + input.getDirector() + " starring "
            + input.getProtag() + "." + "\n" + "Description: " + input.getDescription());

            x = dataAlgorithm.valueGenerator(input, movieList); 
            List<String> a = dataAlgorithm.sortDescending(x);
            for(int i = 1; i < 11; i++)
            {
                System.out.print("Number " + i + ": " + a.get(i) + " - ");
                pH = methods.getMovieData(a.get(i), movieList);
                System.out.print(pH.getDescription());
                System.out.println();
            }
        } 
    else if (methods.closeToAnother(movieName, movieList)) 
        {
            possibleMovie1 = methods.closeToAnotherArray(movieName, movieList);

            for(int i = 0; i < possibleMovie1.size(); i++)
            {
                System.out.println(possibleMovie1.get(i).getMovieName());
            }
            System.out.println("If so then retype your answer, if not then type anything to end program");
            movieName = scanner.nextLine();

            if(methods.inDatabase(movieName, possibleMovie1))
            {
                for(int i = 0; i < possibleMovie1.size(); i++)
                {
                    input = methods.getMovieData(movieName, possibleMovie1);
                }

                System.out.println("Your Movie is: " + input.getMovieName() + " by Director " + input.getDirector() + " starring "
                 + input.getProtag() + "." + "\n" + "Description: " + input.getDescription());
                
                 x = dataAlgorithm.valueGenerator(input, movieList); 
                List<String> a = dataAlgorithm.sortDescending(x);
                for(int i = 1; i < 11; i++)
                {
                    System.out.print("Number " + i + ": " + a.get(i) + " - ");
                    pH = methods.getMovieData(a.get(i), movieList);
                    System.out.print(pH.getDescription());
                    System.out.println();
                }
            } 
            else
            {
                System.out.print("Your movie could not be found on the database");
            }
        } 
    else
    {
        System.out.print("Your movie could not be found on the database");
    }
    scanner.close();
    }
}