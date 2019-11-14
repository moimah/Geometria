package dad.geometria.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
			
		controller = new Controller();
		
		Scene scene = new Scene(controller.getView(), 820, 820);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Geometría");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
