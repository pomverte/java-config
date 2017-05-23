package fr.pomverte.javaconfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JavaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigApplication.class, args);
	}
}

@Data
@Component
class TotoBean {
    private String name = "jack";
    private String age = "21";
}

@Slf4j
@AllArgsConstructor
@Component
class Printer implements CommandLineRunner {

    private final TotoBean totoBean;

    @Override
    public void run(String... strings) throws Exception {
        log.info(this.totoBean.toString());
    }
}