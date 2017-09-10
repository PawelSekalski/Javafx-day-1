package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public Main() {
		System.out.println("Wywo³ujê kontruktor");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println("Wywo³ujê metodê init");
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("Wywo³ujê metodê stop");
	}
	
	@Override
	public void start(Stage Stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/MainView.fxml"));
		Scene scene = new Scene (parent);
		Stage.setScene(scene);
		Stage.setTitle("First JavaFX app");
		Stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
