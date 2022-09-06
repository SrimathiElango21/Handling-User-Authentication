package com.example.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.Authentication.controllers.LoginController;
import com.example.Authentication.controllers.UserDNEController;
import com.example.Authentication.entities.User;
import com.example.Authentication.exceptions.UserNotFoundException;
import com.example.Authentication.services.UserService;

@SpringBootApplication
@Import({
    UserNotFoundException.class,
    UserService.class,
    LoginController.class,
    User.class,
    UserDNEController.class
})
public class SpringPhase3PracticeProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhase3PracticeProject3Application.class, args);
	}

}
