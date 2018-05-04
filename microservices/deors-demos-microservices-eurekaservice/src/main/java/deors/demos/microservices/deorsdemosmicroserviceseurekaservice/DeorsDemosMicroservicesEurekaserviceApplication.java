package deors.demos.microservices.deorsdemosmicroserviceseurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
public class DeorsDemosMicroservicesEurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeorsDemosMicroservicesEurekaserviceApplication.class, args);
	}
}
