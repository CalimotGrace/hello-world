import java.util.Scanner;
public class practice10 
{
  public practice10()
  {
	  Scanner input = new Scanner (System.in);
	  
// Prompt the user to enter an ASCII code
// (an integer between 0 and 127)
	System.out.print("Enter an ASCII code: ");
			int i = input.nextInt();

// Display ASCII code as character
	System.out.println((char)i);
	
	 // Display Program Info
    System.out.println("This Program Displays The Characters Of An ASCII Code.\n");

    // prompt user to enter details
    System.out.println("Enter an ASCII code (an integer between 0 and 127):");
    int aSCIICode = input.nextInt();

    // convert ASCII code to the equivalent character
    char displayCharacter = (char) aSCIICode;

    // display the result
    System.out.println("The character is " + displayCharacter + "\n");
  }
	public static void main(String[] args)
	{
		new practice10();

	}

}
