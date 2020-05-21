package eurekaserver.eurekaserverjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServerJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryServerJavaApplication.class, args);
        System.out.println(" ==== eureka server is running ===== ");
    }

}
