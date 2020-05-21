package javamicroservices.movieInfoService.Controllers;


import javamicroservices.movieInfoService.Model.Movie;
import javamicroservices.movieInfoService.Model.MovieDataDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/moviesinfo")
public class movieInfoController {

     @Value("${api.key}")
    private String apiKey;

     @Autowired
    RestTemplate getRestTemplate;

    @GetMapping("/{movieId}")
   public Movie getMovieInfo (@PathVariable("movieId") String movieId ){

        System.out.println(" movie id ====> "+ movieId);
        System.out.println("Api key ====> "+ apiKey);

        MovieDataDB movieData = getRestTemplate.getForObject(
              "https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey,
              MovieDataDB.class);

        System.out.println("movieData ===> "+ movieData.getOverview());

        return new Movie(movieId,  movieData.getTitle());
    }


}
