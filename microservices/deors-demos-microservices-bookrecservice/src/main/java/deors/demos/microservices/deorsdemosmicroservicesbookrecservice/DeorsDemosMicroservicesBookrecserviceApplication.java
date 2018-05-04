package deors.demos.microservices.deorsdemosmicroservicesbookrecservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
public class DeorsDemosMicroservicesBookrecserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeorsDemosMicroservicesBookrecserviceApplication.class, args);
	}
}