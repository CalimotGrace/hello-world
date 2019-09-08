import java.util.Scanner;

public class Calimot2 
{
	public Calimot2()
	{
Scanner input = new Scanner(System.in);
String ID;

System.out.println("Employees ID = ");
ID = input.next();
System.out.println("Input the working hrs: ");
double WorkingHours = input.nextDouble();
System.out.println("Salary amount/hrs: Php");
double salaryAmount = input.nextDouble();

//compute
double salary = WorkingHours*salaryAmount;

System.out.println("Employees ID = ");
ID = input.next();
System.out.printf("Salary= Php %.2f", salary);
	}
public static void main(String[] args)
{
	new Calimot2();
}
}
