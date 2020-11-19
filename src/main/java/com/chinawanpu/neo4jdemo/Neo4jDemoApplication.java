package com.chinawanpu.neo4jdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Admin
 */
@SpringBootApplication
@EntityScan(basePackages = "com.chinawanpu.neo4jdemo.entity")
public class Neo4jDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(Neo4jDemoApplication.class, args);
    }
}
