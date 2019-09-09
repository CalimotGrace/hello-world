import java.util.Scanner;

public class practice15 
{
   public practice15()
   {
	   Scanner input = new Scanner (System.in);
	   
	// Prompt the user to enter a temperature between -58F and 
	// 41F and a wind speed greater than or equal to 2.
	   
	System.out.print("Enter the temperature in Fahrenheit " + "between -58ºF and 41ºF: ");
	double temperature = input.nextDouble();
	System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
	double speed = input.nextDouble();

	// Compute the wind chill index
	
	double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

	// Display result
	
    System.out.println("The wind chill index is " + windChill);
    
    System.out.println("Enter the outside temperature in Fahrenheit "
            + "(between -58 and 41 degrees):");
    double temperature = input.nextDouble();
    System.out.println("Enter the wind speed in miles per hour "
            + "(greater than or equal to 2 mph):");
    double speed = input.nextDouble();

    // calculate area using the formula 
    //twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16))
    // where twc = wind-chill temperature
    // ta = outside temperature measured in degrees Fahrenheit
    // v = v is the speed measured in miles per hour
    // Note that formula cannot be used for wind speeds below 2 mph or 
    // temperatures below -58 degrees Fahrenheit or above 41 degrees Fahrenheit
    double windChillTemperature = 35.74 + (0.6215 * temperature) - (35.75
            * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));
    // format area to five decimal places
    windChillTemperature = (int) (windChillTemperature * 100000) / 100000.0;

    // display the result
    System.out.println("The area of the hexagon is " + windChillTemperature + "\n");
   }
	public static void main(String[] args) 
	{
	  new practice15();

	}

}
