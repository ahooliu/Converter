import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import java.text.*;
import javafx.scene.text.Text;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;

public class ConverterFXPane extends HBox{
	
	private TextField input;
	private Text output;
	
	public ConverterFXPane(){
		
		Font font = new Font(18);
		Font outputFont = new Font(17);
		
		Label inputLabel = new Label ("Input a number and select an option");
		inputLabel.setFont(font);
		
		input = new TextField();
		input.setFont(font);
		input.setPrefWidth(120);
		input.setAlignment(Pos.CENTER);
		
		//Buttons =================================================
		Button temp = new Button ("FahrenHeit to Celcius");
		temp.setOnAction(this::buttonTemp);
		
		Button milesDistance = new Button ("Miles to Kilometers");
		milesDistance.setOnAction(this::buttonDistanceKM);
		
		Button speed = new Button ("Miles/hour to Kilometers/hour");
		speed.setOnAction(this::buttonSpeed);
		
		Button feetDistance = new Button ("Feet to Meters");
		feetDistance.setOnAction(this::buttonDistanceMETERS);
		
		Button inchDistance = new Button ("Inch to Centimeters");
		inchDistance.setOnAction(this::buttonDistanceCM);
		
		Button poundWeight = new Button ("Pounds to Kilogram");
		poundWeight.setOnAction(this::buttonWeight);
		//=========================================================
		
		output = new Text ("");
		output.setFont(outputFont);
		
		HBox inputSection = new HBox (inputLabel, input);
		inputSection.setAlignment(Pos.CENTER);
		inputSection.setSpacing(20);
		
		VBox allObjects = new VBox (inputSection, output, temp, milesDistance, speed, feetDistance, inchDistance, poundWeight);
		allObjects.setAlignment(Pos.CENTER);
		allObjects.setSpacing(12);
		
		setStyle("-fx-background-color: lightcyan");
		
		setSpacing(20);
		getChildren().addAll(allObjects);
	
	}
	
	public void buttonTemp(ActionEvent event){
		double inputNum = Double.parseDouble(input.getText());
		Converter tempObject = new Converter();
		
		output.setText(input.getText() + " fahrenheit is " + tempObject.C2F(inputNum) + " celcius.");
		
	}
	
	public void buttonDistanceKM(ActionEvent event){
		
		double inputNum = Double.parseDouble(input.getText());
		Converter distanceObject = new Converter();
		
		output.setText(input.getText() + " miles is " + distanceObject.Miles2Kilometers(inputNum) + " kilometers.");
		
	}
	
	public void buttonSpeed(ActionEvent event){
		
		double inputNum = Double.parseDouble(input.getText());
		Converter speedObject = new Converter();
		
		output.setText(input.getText() + " Mph is " + speedObject.Mph2Kph(inputNum) + " Kph.");
		
	}
	
	public void buttonDistanceMETERS(ActionEvent event){
		
		double inputNum = Double.parseDouble(input.getText());
		Converter distanceObject = new Converter();
		
		output.setText(input.getText() + " feet is " + distanceObject.Feet2Meters(inputNum) + " meters.");
		
	}
	
	public void buttonDistanceCM(ActionEvent event){
		
		double inputNum = Double.parseDouble(input.getText());
		Converter distanceObject = new Converter();
		
		output.setText(input.getText() + " inches is " + distanceObject.Inch2Cm(inputNum) + " centimeters.");
		
	}
	
	public void buttonWeight(ActionEvent event){
		
		double inputNum = Double.parseDouble(input.getText());
		Converter weightObject = new Converter();
		
		output.setText(input.getText() + " pounds is " + weightObject.Pound2Kg(inputNum) + " kilograms.");
		
	}
	
}