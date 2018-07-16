package cn.tpson.springcloud.demo.ch8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

/**
 * Created by Zhangka in 2018/07/12
 */
@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy
//@ConditionalOnMissingBean
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        for (String s : environment.getActiveProfiles()) {
            log.info(s);
        }
        log.info("=================================================");

        for (String s : environment.getDefaultProfiles()) {
            log.info(s);
        }
        log.info("=================================================");
    }
}
