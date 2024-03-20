package co.pitam.pitamibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public final static String qName="ORDER.RESPONSE";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
