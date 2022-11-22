package eureka.tingeso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TingesoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TingesoApplication.class, args);
	}

}
