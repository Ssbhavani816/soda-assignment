package soda.service;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import soda.bean.HasQuarterState;
import soda.bean.NoQuarterState;
import soda.bean.SodaMachineContext;
import soda.bean.SoldOutState;
import soda.bean.SoldState;
import soda.bean.State;

public class SodaMachineUI extends Application {

	private SodaMachineContext context;

	@Override
	public void start(Stage primaryStage) {
		context = new SodaMachineContext(null, 5); // Starting with 5 sodas

		// context = new SodaMachineContext(new SoldOutState(new
		// SodaMachineContext(null, 5)), 5); // Starting with 5 sodas
		State soldOutState = new SoldOutState(context);
		State noQuarterState = new NoQuarterState(context);
		State hasQuarterState = new HasQuarterState(context);
		State soldState = new SoldState(context);

		context.setState(noQuarterState); // Set initial staFte
		primaryStage.setTitle("Soda Machine");

		VBox vbox = new VBox();
		vbox.setSpacing(10);

		Button insertQuarterButton = new Button("Insert Quarter");
		insertQuarterButton.setOnAction(e -> context.insertQuarter());

		Button ejectQuarterButton = new Button("Eject Quarter");
		ejectQuarterButton.setOnAction(e -> context.ejectQuarter());

		Button pushSodaButton = new Button("Push Soda Button");
		pushSodaButton.setOnAction(e -> context.pushSodaButton());

		vbox.getChildren().addAll(insertQuarterButton, ejectQuarterButton, pushSodaButton);

		Scene scene = new Scene(vbox, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
