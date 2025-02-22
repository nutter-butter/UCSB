import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        csvReader ratings = new csvReader("archive/ratings_small.csv", 2);
        ArrayList<String> ratingsList = ratings.getColumn("archive/ratings_small.csv", 2);
        for(int i = 0; i < ratingsList.size() - 1; i++) {
            System.out.println(ratingsList.get(i));
        }
    } 
}

//movies num: 45572