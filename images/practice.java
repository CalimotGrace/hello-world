import java.util.Scanner;

public class practice 
{
  public practice()
  {
Scanner input = new Scanner(System.in);
//Declare variables
double pounds;
double kilograms;

System.out.println("Enter a number in pounds: ");
pounds = input.nextDouble();

//compute
//one pounds is 0.454 kilograms
kilograms = pounds*0.454;

//Display Result
System.out.println(pounds + " is " + kilograms + " kilograms ");

  }
  
	public static void main(String[] args) 
	{
		new practice ();
	}

}
