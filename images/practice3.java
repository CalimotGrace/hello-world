import java.util.Scanner;

public class practice3 
{
	public practice3 ()
	{
Scanner input = new Scanner(System.in);

//Declare Variables
int number;
int lastDigit;
int remainingNumber;
int secondLastDigit;
int thirdLastDigit;
int sum;

System.out.println("Enter a number between 0 and 1000: ");
number = input.nextInt();

//extra digit
lastDigit = number % 10;

//remove the extracted digit 
remainingNumber = number / 10;

//extra second last digit
secondLastDigit = remainingNumber % 10;

//remove extracted second last digit
remainingNumber /=10;

//extra third last digit
thirdLastDigit = remainingNumber % 10;

//sum up the numbers
sum = lastDigit + secondLastDigit + thirdLastDigit;

//Display Results
System.out.println("The sum of the digit is " + sum);

}

	public static void main(String[] args)
	{
	 new practice ();
	}

}
