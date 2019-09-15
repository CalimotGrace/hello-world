import java.util.Scanner;

public class Calimotgrace
{
  public Calimotgrace ()
  {
	  Scanner in = new Scanner(System.in);
	  
	//Declare variable
	  int grade;
	  String GM="";
	  
	//in1 
      System.out.print("Input Grade: ");
	  grade = in.nextInt();
	  if (grade <= 95 && grade <= 100)
	  GM = "EXCELLENT!";
	  if (grade <= 85 && grade <= 94)
	  GM = "GOOD!";
	  if (grade <= 80 && grade <= 84)
	  GM = "APPROACHING!";
	  if (grade <= 75 && grade <= 79)
	  GM = "NEED IMPROVEMENT";
	  if (grade <= 74)
	  GM = "Poor";
	  
  //out1
	  System.out.printf(grade + " " + GM + "\n"); 
	  
  //in2 
      System.out.print("Input Grade: ");
	  grade = in.nextInt();
	  if (grade <= 95 && grade <= 100)
	  GM = "EXCELLENT!";
	  if (grade <= 85 && grade <= 94)
	  GM = "GOOD!";
	  if (grade <= 80 && grade <= 84)
	  GM = "APPROACHING!";
	  if (grade <= 75 && grade <= 79)
	  GM = "NEED IMPROVEMENT";
	  if (grade <= 74)
	  GM = "Poor";
	  
  //out2
	  System.out.printf(grade + " " + GM + "\n");
	 
	  
  //in3
      System.out.print("Input Grade: ");
	  grade = in.nextInt();
	  if (grade <= 95 && grade <= 100)
	  GM = "EXCELLENT!";
	  if (grade <= 85 && grade <= 94)
	  GM = "GOOD!";
	  if (grade <= 80 && grade <= 84)
	  GM = "APPROACHING!";
	  if (grade <= 75 && grade <= 79)
	  GM = "NEED IMPROVEMENT";
	  if (grade <= 74)
	  GM = "Poor";
	  
  //out3
	  System.out.printf(grade + " " + GM + "\n");
		 
  }
	public static void main(String[] args)
	{
		new Calimotgrace ();

	}

}
