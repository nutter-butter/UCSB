public class Movie {

    String movieName; //Name of movie
    String genre; 
    String director;
    String protag; //Actor of lead role
    int time; //Time in seconds
    String rating;
    String description;
    String type;
    
    public Movie(String movieName, String type, String director, String protag, String rating, int time, String description)
    {
        this.movieName = movieName;
        this.director = director;
        this.protag = protag;
        this.rating = rating;
        this.time = time;
        this.type = type;
    }

    public String getDescription() {
        return description;
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
    public String getType() {
        return type;
    }
    public int getTime() {
        return time;
    }

    public String getRating() {
        return rating;
    }
}
