package top.valley.initialproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
@MapperScan("top.valley.initialproject.mapper")
public class InitialProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(InitialProjectApplication.class, args);
    }
}
