package org.songdan.spring.cloud.config.client.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Songdan
 * @date 2017/1/13 15:30
 */
@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${songdan-config-client.lucky-word}")
    String luckyWord;

    @RequestMapping("/")
    public String showLucyWord() {
        return "The lucky word is : " + luckyWord;
    }



}
