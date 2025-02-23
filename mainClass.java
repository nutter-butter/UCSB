import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
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

        csvReader descriptions = new csvReader(data, 11);
        ArrayList<String> descsList = descriptions.getColumn();

        csvReader protags = new csvReader(data, 4);
        ArrayList<String> protagsL =  protags.getColumn();
        ArrayList<String> protagsList = protags.createList(protagsL);
    } 
}

//movies num: 45572