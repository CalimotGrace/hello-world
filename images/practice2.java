import java.util.Scanner;

public class practice2
{
	public practice2()
    {
Scanner input = new Scanner (System.in);
//Declare Variables
double subtotal;
double rate;
double gratuity;
double total;

System.out.println("Enter a subtotal and gratuirty rate: ");
subtotal = input.nextDouble();
rate = input.nextDouble();

//compute
gratuity = subtotal*(rate/100);
total = subtotal + gratuity; 

//Display Result
System.out.println("The gratuity is  " + gratuity "total is"  +total);
    }

	public static void main(String[] args)
	{
	 new practice2 ();
	}

}
