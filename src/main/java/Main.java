import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application
{
	@Override
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/LoginView.fxml")); // we can change this later if need be

		AnchorPane view = loader.load();
		
		// TODO: add stuff here

//		SumController controller = loader.getController();
//		AdderModel model = new AdderModel();
//		controller.setModel(model);

		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
