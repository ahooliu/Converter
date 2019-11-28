import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class ConverterFX extends Application{
	
	public void start (Stage primaryStage){
		
		ConverterFXPane pane = new ConverterFXPane();
		pane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene (pane, 500, 325);

		primaryStage.setTitle("Imperical to Metric :)");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}