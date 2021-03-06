package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * Main.java
 * The class for starting the entire Program.
 * @version 1.01
 * @author Jonathan K
 *
 */

public class Main extends Application {
	/**
	 * The starting method to launch the GUI.
	 */
	
	@Override
	public void start(Stage primaryStage) {
		try {
			GUIMaker GUIMaker1 = new GUIMaker();
			BorderPane root = new BorderPane();
			root.setTop(GUIMaker1.makeTopGUI());
			Scene scene = new Scene(root,1024,768); //Make the Program size 1024 x 768.
			MapManager.sharedMapManager();//Make new MapManager.
			Map currentMap = new Map();
			MapManager.sharedMapManager().setMap(currentMap); //set MapManager to currentMap.
			primaryStage.setScene(scene); //Set scene.
			primaryStage.show(); //Display scene.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Starting everything.
	 * @param args
	 */
	public static void main(String[] args) {

		launch(args);
	}
}
