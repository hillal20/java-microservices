package javamicroservices.movieRatingService.controllers;


import javamicroservices.movieRatingService.model.MovieRating;
import javamicroservices.movieRatingService.model.UserRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("rating")
public class movieRatingController {


    @GetMapping("/{movieId}")
   public List<MovieRating> movieByRating (@PathVariable String movieId ){

        System.out.println(" ----> request -----> ");
        // ratings
        List<MovieRating> ratings = new ArrayList<MovieRating>();
        ratings.add(new MovieRating("90", 8));
        ratings.add(new MovieRating("91", 3));
        return  ratings;

    }

    @GetMapping("/users/{userId}")
    public UserRatings userMoviesByRating (@PathVariable String userId ){

        System.out.println(" ----> request -----> ");
        // ratings
        List<MovieRating> ratings = new ArrayList<MovieRating>();
        ratings.add(new MovieRating("90", 8));
        ratings.add(new MovieRating("91", 3));


        UserRatings userRatings = new UserRatings();
        userRatings.setUserMoviesRatings(ratings);
        return userRatings;

    }

}
