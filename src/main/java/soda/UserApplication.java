//package soda;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication()
//public class UserApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(UserApplication.class, args);
//	}
//
//}


package soda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import soda.service.SodaMachineUI;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		// Start Spring Boot application
		SpringApplication.run(UserApplication.class, args);

		// Start JavaFX application on a separate thread
		new Thread(() -> Application.launch(SodaMachineUI.class)).start();
	}
}

