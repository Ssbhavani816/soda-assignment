package soda.service;

import soda.bean.HasQuarterState;
import soda.bean.NoQuarterState;
import soda.bean.SodaMachineContext;
import soda.bean.SoldOutState;
import soda.bean.SoldState;
import soda.bean.State;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SodaMachineContext context = new SodaMachineContext(null, 5); // Starting with 5 sodas
		State soldOutState = new SoldOutState(context);
		State noQuarterState = new NoQuarterState(context);
		State hasQuarterState = new HasQuarterState(context);
		State soldState = new SoldState(context);

		context.setState(noQuarterState); // Set initial staFte

		MicrocontrollerService microcontrollerService = new MicrocontrollerService();

		System.out.println("Welcome to the Soda Machine!");

		while (true) {
			System.out.println("\nSelect an action:");
			System.out.println("1. Insert Quarter");
			System.out.println("2. Eject Quarter");
			System.out.println("3. Push Soda Button");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				context.insertQuarter();
				break;
			case 2:
				context.ejectQuarter();
				break;
			case 3:
				context.pushSodaButton();
				break;
			case 4:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
