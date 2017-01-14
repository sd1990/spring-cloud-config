package org.songdan.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Songdan
 * @date 2017/1/13 14:04
 */
@EnableConfigServer
@SpringBootApplication
@RefreshScope
public class MyConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyConfigServerApplication.class, args);
    }

}
