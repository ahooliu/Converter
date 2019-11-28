import java.text.DecimalFormat;
public class Converter{

	private DecimalFormat fmt = new DecimalFormat("0.###");

	public double C2F(double fahrenheit){
		
		double celcius = Double.parseDouble(fmt.format((fahrenheit - 32)/1.8));
		
		return celcius;
	
	}
	
	public double Miles2Kilometers(double miles){
		
		double km = Double.parseDouble(fmt.format(miles/0.62137));
		
		return km;
		
	}
	
	public double Mph2Kph (double mph){
		
		double kph = Double.parseDouble(fmt.format(mph * 1.6093));
		
		return kph;
		
	}
	
	public double Feet2Meters (double feet){
		
		double meters = Double.parseDouble(fmt.format(feet * 0.3048));
		
		return meters;
		
	}
	
	public double Inch2Cm (double inch){
		
		double cm = Double.parseDouble(fmt.format(inch * 2.54));
		
		return cm;
		
	}
	
	public double Pound2Kg (double lbs){
	
		double kg = Double.parseDouble(fmt.format(lbs * 0.45359237));
		
		return kg;
		
	}

}
