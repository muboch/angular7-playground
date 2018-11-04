package ch.mubo.bkmonitor;

import ch.mubo.bkmonitor.entities.LogMessage;
import ch.mubo.bkmonitor.repository.LogMessageRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BkMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkMonitorApplication.class, args);
	}


	@Bean
	ApplicationRunner init(LogMessageRepository repository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
				LogMessage message = new LogMessage();
				//message.setId(1);
				message.setXmlIn(name);
				message.setXmlOut(name);
				repository.save(message);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
