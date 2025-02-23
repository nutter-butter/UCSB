
public class Movie 
{
    private String movieName;
    private String director;
    private String protag; //Actor of lead role
    private String rating;
    private String description;
    private String country;
    
    public Movie(String movieName, String country, String rating, String director, String protag, String description)
    {
        this.movieName = movieName;
        this.country = country;
        this.director = director;
        this.rating = rating;
        this.protag = protag;
        this.description = description;
    }

    public Movie()
    {
        movieName = "There is no Movie or TV show with that title in the database";
    }

    public String getMovieName()
    {
        return movieName;
    }

    public String getCountry() {
        return country;
    }

    public String getProtag() {
        return protag;
    }

    public String getDirector() {
        return director;
    }

    public String getDescription() {
        return description;
    }

    public String getRating()
    {
        return rating;
    }
}