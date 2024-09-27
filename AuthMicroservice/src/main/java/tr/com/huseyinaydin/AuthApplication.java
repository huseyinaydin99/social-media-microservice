package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        System.out.printf("Merhabalar gardaş burası AuthMicroservice");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        SpringApplication.run(AuthApplication.class, args);
    }
}