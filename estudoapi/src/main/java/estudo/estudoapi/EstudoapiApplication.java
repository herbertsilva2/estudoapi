package estudo.estudoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:META-INF/applicationContext.xml"})
public class EstudoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoapiApplication.class, args);
	}

}
