package io.kubecloudsinc.kubecloudsapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "io.kubecloudsinc.kubecloudsapp")
@EnableJpaRepositories(basePackages = {"io.kubecloudsinc.kubecloudsapp.repository"})
@EntityScan(basePackages = {"io.kubecloudsinc.kubecloudsapp.model"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Slf4j
public class KubecloudsappApplication {

    public static void main(String[] args) {
        log.info("Starting application");
        SpringApplication.run(KubecloudsappApplication.class, args);
    }

}
