package brn.br.com.TesteTecnicoBackEndAttornatus;

import brn.br.com.TesteTecnicoBackEndAttornatus.config.MainConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Date;



@SpringBootApplication
@EnableCaching
public class TesteTecnicoBackEndAttornatusApplication  implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final String applicationName;

	@Autowired
	public TesteTecnicoBackEndAttornatusApplication(MainConfiguration mainConfiguration) {
		this.applicationName = mainConfiguration.getApplicationName();
	}

	public static void main(String[] args) {
		SpringApplication.run(TesteTecnicoBackEndAttornatusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("A P L I C A C A O  C A R R E G A D A");
		logger.info("[\"applicationName\": {}, \"startedAt\": {}]", this.applicationName, new Date());

	}
}