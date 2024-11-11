package it.schoolboard.sbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.time.LocalDate;

@SpringBootApplication
@EnableMongoAuditing
public class SbapiApplication {
    public static void main(String[] args) {

        SpringApplication.run(SbapiApplication.class, args);

    }

}
