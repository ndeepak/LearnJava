package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class JavaFXMenu extends Application {

	public static void main(String[] args) {
		launch(args); // Invoke start() methods
	}

	@Override
	public void start(Stage stage) throws Exception {
		MenuBar bar = new MenuBar();
		Menu file = new Menu("FILE");
		
		MenuItem open = new MenuItem();
		open.setOnAction(e-> new FileChooser().showOpenDialog(stage));
		
		MenuItem exit = new MenuItem("EXIT");
		exit.setStyle("-fx-background-color:red; -fx-fill-text:white;");
		exit.setOnAction(e->System.exit(0));
		
		BorderPane root = new BorderPane(); // Layout just like BorderLayout
		root.setTop(bar); 
		bar.getMenus().addAll(file);
		file.getItems().addAll(open, exit);
		
		
		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene); // Setting the scene in stage.
		
		// Showing the stage in show
		stage.show();
		
//		stage.sleep(10000);
		
	}

}
