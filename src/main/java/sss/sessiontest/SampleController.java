package sss.sessiontest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@Slf4j
public class SampleController {

    @GetMapping("/hello/{username}")
    public String sayHello(@PathVariable String username, HttpServletRequest request) {
        System.out.println(request);
        return username + " hello!";
    }

    @GetMapping("/hello2/{username}")
    public String sayHello2(@PathVariable String username, HttpServletRequest request) {
        HttpSession session = request.getSession();
        log.info("2 session: {}", session);
        log.info(session.getId());
        return username + " hello!";
    }
}
