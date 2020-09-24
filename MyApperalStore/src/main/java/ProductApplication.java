
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="ApperalStore.MyApperalStore")
@ComponentScan({"ApperalStore.MyApperalStore.controller"})
@EnableJpaRepositories("ApperalStore.MyApperalStore.controller")
@EntityScan("ApperalStore.MyApperalStore.pojo")
public class ProductApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ProductApplication.class, args);
	}
	
}
