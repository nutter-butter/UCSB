import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        String imdbRatings = "netflix_imdb.csv";
        String data = "netflix_titles.csv";

        csvReader titles = new csvReader(data, 2);
        ArrayList<String> titlesList = titles.getColumn();
        csvReader directors = new csvReader(data, 3);
        ArrayList<String> directorsList = directors.getColumn();
        csvReader country = new csvReader(data, 5);
        ArrayList<String> countriesList = country.getColumn();
        csvReader ratings = new csvReader(data, 8);
        ArrayList<String> ratingsList = ratings.getColumn();
        csvReader duration = new csvReader(data, 9);
        ArrayList<String> durationList = duration.getColumn();

        for(String s : durationList) {
            System.out.println(s);
        }
    } 
}

//movies num: 45572