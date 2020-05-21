package javamicroservices.movieRatingService.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


public class MovieRating {


   private  String  movieId ;
    private int rating;

    public MovieRating() {
    }

    public MovieRating(String id, int rating) {
        this.movieId = id ;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieRating{" +
                "movieId='" + movieId + '\'' +
                ", rating=" + rating +
                '}';
    }
}
