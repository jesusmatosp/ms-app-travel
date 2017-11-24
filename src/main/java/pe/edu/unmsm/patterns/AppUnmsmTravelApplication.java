package pe.edu.unmsm.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppUnmsmTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppUnmsmTravelApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
