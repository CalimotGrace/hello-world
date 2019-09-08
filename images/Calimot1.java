
import java.util.Scanner;

public class Calimot1 
{
  public Calimot1 ()
  {
Scanner input = new Scanner (System.in);

System.out.println("ENTER WEIGHT IN POUNDS: "); //n
double weight = input.nextDouble();
System.out.println("ENTER HEIGHT IN INCHES: "); //n
double height = input.nextDouble();

weight = weight*0.45359237;
height = height*0.0254;

//compute
double BMI = weight / (height * height);
System.out.printf("BMI IS %.4f", BMI);
  }
	public static void main(String[] args) 
	{
		new Calimot1();

	}

}
