public class Movie {

    String movieName; //Name of movie
    String genre;
    String protag; //Actor of lead role
    double time; //Time in seconds
    double rating; //Rating from 0-5
    boolean type;
    String director;
    String description;
    
    public Movie(String movieName, String genre, String director, String protag, double rating, boolean type, double time, String description)
    {
        this.movieName = movieName;
        this.genre = genre;
        this.protag = protag;
        this.rating = rating;
        this.time = time;
        this.type = type;
        this.director = director;
        this.description = description;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getProtag() {
        return protag;
    }

    public double getTime() {
        return time;
    }

    public double getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public boolean isType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
