package javamicroservices.movieRatingService.interceptor;

import javamicroservices.movieRatingService.interceptor.InterceptorClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ConfigClass extends WebMvcConfigurationSupport {


    @Autowired
    InterceptorClass interceptorObj;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorObj);
    }
}
