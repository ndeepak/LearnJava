package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FirstJavaFXConcept extends Application {

	public static void main(String[] args) {
		launch(args); // Launch is to run the start method
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 = new Button("Click Me 1");
		btn1.setOnAction(e->System.exit(0)); // Event Handling
		
		Button btn2 = new Button("Click Me 2");	
		
		
		Button btn3 = new Button("Click Me 3");	
		Button btn4 = new Button("Click Me 4");	
		stage.setTitle("First Drama Show");
		
		FlowPane root = new FlowPane(); // Layout of the scene.
		root.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene); // Setting the scene in stage.
		
		// Showing the stage in show
		stage.show();
	}

}
