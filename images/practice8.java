import java.util.Scanner;

public class practice8 
{
	public practice8()
	{
	
	Scanner input = new Scanner(System.in);
	
	 System.out.print("Enter a degree in Celsius: ");
     double celsius = input.nextDouble();
     
     //Compute
     double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
     System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
 }
	

	public static void main(String[] args) 
	{
		new practice8 ();

	}

}
