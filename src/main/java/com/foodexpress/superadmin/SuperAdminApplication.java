package com.foodexpress.superadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SuperAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperAdminApplication.class, args);
    }

}
