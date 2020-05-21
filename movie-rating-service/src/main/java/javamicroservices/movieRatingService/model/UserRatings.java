package javamicroservices.movieRatingService.model;

import java.util.List;

public class UserRatings {

    private List<MovieRating> userMoviesRatings;


    public UserRatings() {

    }

    public List<MovieRating> getUserMoviesRatings() {
        return userMoviesRatings;
    }

    public void setUserMoviesRatings(List<MovieRating> userRatings) {
        this.userMoviesRatings = userRatings;
    }
}
