package neu.edu.Distributor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"neu.edu.controller","neu.edu.exception","neu.edu.service"})
@EnableJpaRepositories("neu.edu.repository")
@EnableJpaAuditing
@EntityScan("neu.edu.entity")
public class DistributorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributorApplication.class, args);
	}

}
