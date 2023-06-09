package dc.test.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
@SpringBootApplication
public class SpringBatchApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBatchApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplication.class, args);
	}
}
