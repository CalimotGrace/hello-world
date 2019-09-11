
package ex3;
import java.util.Scanner;
public class Ex3 
{

    public static void main(String[] args) 
    {
      Scanner in = new Scanner (System.in);

      System.out.print("Enter time in seconds: ");
     long sec = in.nextLong();
      
      // Compute the number of hours, minutes and seconds
      long seconds = sec / 3600;
      long minutes = sec % 3600/ 60;
      long hours = sec % 60;
      
      System.out.println(" The time is " + seconds + " seconds " + minutes + " mintues " + hours + " hours "); //n
  
      
      //Declare
      double drivingDis, milesGal, price;
      
     System.out.print("Enter the driving distance: ");
     drivingDis = in.nextDouble ();
     System.out.print("Enter miles per gallon: ");
     milesGal = in.nextDouble ();
     System.out.print("Enter price per gallon: ");
     price = in.nextDouble ();
     
     double cost = (drivingDis / milesGal) * price;
     
     
     
   
     System.out.printf(" The cost of driving is: %.2f" , cost);


      
    }
    
}
