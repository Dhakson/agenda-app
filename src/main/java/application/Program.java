package application;

import model.agend.AgendApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Program {
    public static void main(String[] args) {
        SpringApplication.run(AgendApplication.class,args);
    }
}
