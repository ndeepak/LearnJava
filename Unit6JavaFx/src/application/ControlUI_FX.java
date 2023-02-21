package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControlUI_FX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

//		Creating Labels
		Label name = new Label("Your Good Name: ");
		Label email = new Label("Your Email: ");
		Label address = new Label("Address: ");
		Label contact = new Label("Contact Number: ");
		Label age = new Label("Age: ");
		Label gender = new Label("Gender: ");

//		 Corresponding Text Fields
		TextField nametf = new TextField();
		TextField emailtf = new TextField();
		TextField addresstf = new TextField();
		TextField contacttf = new TextField();
		TextField agetf = new TextField();
//		TextField gendertf = new TextField();

//		Creating Buttons
		Button submit = new Button("Submit");
		Button close = new Button("Close");

		Button reset = new Button("Reset");
		reset.setOnAction(e -> {
			nametf.clear();
			emailtf.clear();
			addresstf.clear();
			contacttf.clear();
			agetf.clear();
		});

		Button open = new Button("Open");

//		close.setOnAction(e -> {
//			System.out.println("Windows is closed.");
//			System.exit(0);
//		}
//		);

		open.setOnAction(e -> new FileChooser().showOpenDialog(stage));

//		Creating RadioButtons
		ToggleGroup group = new ToggleGroup();
		RadioButton male = new RadioButton("Male");
		RadioButton female = new RadioButton("female");
		RadioButton ns = new RadioButton("Not Specified");

		male.setToggleGroup(group);
		female.setToggleGroup(group);
		ns.setToggleGroup(group);

//		Creating Check boxes

		CheckBox csit = new CheckBox("B.SC. CSIT");
		CheckBox bca = new CheckBox("BCA");
		CheckBox bbm = new CheckBox("BBM");

//		Creating HyperLinks
		Hyperlink collgelink = new Hyperlink("https://ndeepak.github.io");
		collgelink.setOnAction(e -> {
			System.out.println("Link Clicked");
		});

//		Creating Tool tip
		Tooltip tip = new Tooltip();
		tip.setText("Click here to EXIT");
		Button exit = new Button("Close");
		exit.setTooltip(tip);
		exit.setOnAction(e -> {
			System.out.println("Window is CLOSED");
			System.exit(0);
		});
//		exit.setOnAction(null)

//		Adding CSS
		exit.setStyle("-fx-background-color:red; -fx-text-fill:white;");
		open.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

//		Creating A Grid Pane Layout
		GridPane root = new GridPane();
		root.setId("rootid");
//		Setting Size for the Pane
		root.setMinSize(500, 450);
		root.setVgap(5);
		root.setHgap(5);
		root.setPadding(new Insets(5, 5, 5, 5));

//		Setting the Grid Alignment
		root.setAlignment(Pos.CENTER);

		root.add(name, 0, 0);
		root.add(nametf, 1, 0);
		root.add(email, 0, 1);
		root.add(emailtf, 1, 1);
		root.add(address, 0, 2);
		root.add(addresstf, 1, 2);
		root.add(contact, 0, 3);
		root.add(contacttf, 1, 3);
		root.add(age, 0, 4);
		root.add(agetf, 1, 4);
		root.add(gender, 0, 5);

		root.add(male, 1, 5);
		root.add(female, 1, 6);

		root.add(ns, 1, 7);
		root.add(new Text("I am a student of: "), 0, 8);
		root.add(csit, 1, 8);
		root.add(bca, 2, 8);
		root.add(bbm, 3, 8);

		root.add(submit, 1, 9);
		root.add(reset, 2, 9);

		root.add(new Text("Click HERE for more information"), 0, 10);
		root.add(collgelink, 1, 10);
		root.add(exit, 3, 11);
		root.add(open, 0, 11);

//		Creating A Scene Object, adding and displaying.
		Scene scene = new Scene(root);
		stage.setScene(scene);
		scene.getStylesheets().add(getClass().getResource("controlstyle.css").toExternalForm());
		stage.setTitle("Contol UI Components");
		stage.show();

	}

}
