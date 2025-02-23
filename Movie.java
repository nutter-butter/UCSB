public class Movie {

    String movieName; //Name of movie
    String genre; 
    String director;
    String protag; //Actor of lead role
    int time; //Time in seconds
    String rating; //Rating from 0-5
    
    public Movie(String movieName, String director, String protag, String rating, int time)
    {
        this.movieName = movieName;
        this.director = director;
        this.protag = protag;
        this.rating = rating;
        this.time = time;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    public String getProtag() {
        return protag;
    }

    public int getTime() {
        return time;
    }

    public String getRating() {
        return rating;
    }
}
