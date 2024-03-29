package application;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Label;  
import javafx.scene.layout.*;  
import javafx.stage.Stage;  
public class BorderPaneExample extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        BorderPane BPane = new BorderPane();  
        BPane.setTop(new Label("This will be at the top"));  
        BPane.setLeft(new Label("This will be at the left"));  
        BPane.setRight(new Label("This will be at the Right"));  
        BPane.setCenter(new Label("This will be at the Centre"));  
        BPane.setBottom(new Label("This will be at the bottom"));  
        Scene scene = new Scene(BPane,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("BorderPane");
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
      
}  