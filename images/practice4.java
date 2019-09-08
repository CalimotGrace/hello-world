
import java.util.Scanner;

public class practice4 
{
	public practice4 ()
	{
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();

// Compute the number of years and days
int years = minutes / 525600;
int days = (minutes % 525600) / 1440;

// Display results
System.out.println(minutes + " minutes is approximately " + years
	+ " years and " + days + " days");
}

	public static void main(String[] args) 
	{
		new practice4 ();

	}

}
