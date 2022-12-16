package com.example.testrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
@RequestMapping("/")
public class TestController {
    Logger logger = Logger.getLogger(TestController.class.getName());

    @GetMapping("/forAliceTestLong")
    public String forAliceTestLong() throws InterruptedException {
        logger.info("Get data from database (RestTemplate on client-service side)");
        logger.info("3");
        Thread.sleep(20000);
        logger.info("4");
        return "Salam Alice";
    }
}
