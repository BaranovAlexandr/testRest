package com.example.testrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private Environment env;
    Logger logger = Logger.getLogger(TestController.class.getName());

    @RequestMapping("/a")
    public String home() {
        String home = "Book-Service running at port: " + env.getProperty("local.server.port");
        logger.info(home);
        return home;
    }

    @RequestMapping("/")
    public String hom() {
        String home = "Book-Service running at port:";
        logger.info(home);
        return home;
    }

    @GetMapping("/forAliceTestLong")
    public String forAliceTestLong() throws InterruptedException {
        logger.info("Get data from database (RestTemplate on client-service side)");
        logger.info("3");
        Thread.sleep(20000);
        logger.info("4");
        return "Salam Alice";
    }
}
