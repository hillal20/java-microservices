package javamicroservices.movieRatingService.Filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/rating/movie/11")
public class Filter_1 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println(".......... filter one is called ........... ");
        filterChain.doFilter(servletRequest,servletResponse );
    }
}
