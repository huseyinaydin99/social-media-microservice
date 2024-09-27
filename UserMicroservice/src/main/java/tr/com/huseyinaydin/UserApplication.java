package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;

public class UserApplication {
    public static void main(String[] args) {
        System.out.printf("Merhabalar burası UserMicroservice");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        SpringApplication.run(UserApplication.class, args);
    }
}