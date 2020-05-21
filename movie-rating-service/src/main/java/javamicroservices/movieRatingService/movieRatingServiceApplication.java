package javamicroservices.movieRatingService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class movieRatingServiceApplication {


    public static void main(String [] args){
        SpringApplication.run(movieRatingServiceApplication.class, args);
        System.out.println("==== movie rating service is here  =====");

    }

}
