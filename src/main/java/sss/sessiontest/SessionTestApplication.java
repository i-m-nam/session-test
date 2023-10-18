package sss.sessiontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@EnableSpringHttpSession
@SpringBootApplication
public class SessionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionTestApplication.class, args);
    }

}
