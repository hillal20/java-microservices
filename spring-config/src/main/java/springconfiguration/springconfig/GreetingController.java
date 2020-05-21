package springconfiguration.springconfig;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope // provided by actuators to ask spring to refresh whenever the config server yml file get updated and commited to git. to update we call a post request to http://localhost:8084/actuator/refresh via postman
public class GreetingController {

    @Value("${my.greeting}")
    private String myGreeting;


    @Value("${my.listOfValues}")
    private List<String> listOfValues;


    @Value("#{${carInfo}}")
    private Map<String, String> carInfo;

   @Autowired
   private DBSettings dbSettings;


   @Autowired
   private Environment environmentInfo;

    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greeting")
    public String greeting(){
        return myGreeting + listOfValues + carInfo + dbSettings;
    }


    @GetMapping("/environmentinfo")
    public String getEnvironmentInfo(){

         logger.error(" ====>  error is happening ");
//        logger.trace(" ====>  environment method is accessed  "); too much logging 
        return environmentInfo.getProperty("carInfo");
    }

}
