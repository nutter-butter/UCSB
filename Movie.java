public class Movie {

    String movieName; //Name of movie
    String genre; 
    String director;
    String protag; //Actor of lead role
    int time; //Time in seconds
    int rating; //Rating from 0-5
    
    public Movie(String movieName, String genre, String director, String protag, int rating, int time)
    {
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.protag = protag;
        this.rating = rating;
        this.time = time;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
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

    public int getRating() {
        return rating;
    }
}
