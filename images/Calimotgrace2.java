import java.util.Scanner;

public class Calimotgrace2 
{
	public Calimotgrace2 ()
	{
		
	Scanner input = new Scanner (System.in);
	
	
	int NUM1, NUM2, ANS;
	
	//Display1
	System.out.println("First Number: ");
	NUM1 = input.nextInt();
	System.out.println("Second Number: ");
	NUM2 = input.nextInt();
	
	if (NUM1 < NUM2)
	{
	ANS = NUM1 * NUM2;
	System.out.println("The 1st number is lease than the second, please multiply.");
	System.out.println("The Product is " + ANS);
	
	//Display2
		System.out.println("First Number: ");
		NUM1 = input.nextInt();
		System.out.println("Second Number: ");
		NUM2 = input.nextInt();
	}
	if (NUM1 == NUM2)
	{
	ANS = NUM1 + NUM2;
	System.out.println("The two numbers are equal, please add.");
	System.out.println("The Sum is " + ANS);
	
	//Display3
		System.out.println("First Number: ");
		NUM1 = input.nextInt();
		System.out.println("Second Number: ");
		NUM2 = input.nextInt();
	}
	if (NUM1 > NUM2)
	{
	System.out.println("The 1st Number is Greater than the 2nd, please divide\n" + "\nThe Quotient is " + (NUM1 / NUM2)+ "\nThe Remainder is " + (NUM1 % NUM2));
	}
	
	
	}

	public static void main(String[] args) 
	{
	 new Calimotgrace2 ();

	}

}
