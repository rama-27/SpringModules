package dev.rama27;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoRentalsMain {
    public static void main(String[] args) {
        System.out.println("starting springboot application!!");
        SpringApplication.run(AutoRentalsMain.class,args);
        System.out.println("Done spring boot application");
    }
}