package sprbootdocker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "sprbootdocker.demo")
public class SprBootDockerApp {

    public static void main(String[] args) {
        SpringApplication.run(SprBootDockerApp.class, args);
    }

}
