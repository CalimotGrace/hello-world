package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 
{

//    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int one, two, three, four, five, six, seven, eight, results;
        
       //INPUT
       System.out.println("I am competitive: ");
       one = in.nextInt();
       System.out.println("I am annoyed by people who are late for appointments: ");
       two = in.nextInt();
       System.out.println("I perform several tasks simultaneously: ");
       three = in.nextInt();
       System.out.println("I am ambitious: ");
       four = in.nextInt();
       System.out.println("I rush to get tasks completed: ");
       five = in.nextInt();
       System.out.println(" I worry about the future: ");
       six = in.nextInt();
       System.out.println("I am in a race with time: ");
       seven = in.nextInt();
       System.out.println("I speak very rapidly: ");
       eight = in.nextInt();
   
       //COMPUTE
       results = one + two + three+ four + five + six + seven + eight;
       
      
       if (results > 35 && results <40)System.out.println("Score: " + results + "You are Type A");
       else if (results > 21 && results <34)System.out.println("Score: " + results + "Your are Between A and B, tending towards A");
       else if (results > 12 && results < 20)System.out.println("Score: " + results + "You are Between A and B, tending towards B");
       else if (results > 8 && results < 11) System.out.println("Score: " + results + "You are Type B");
       

       
       //ex2
       int  Lthree, Ltwo, Lone;
       
       //INPUT
       System.out.print("\nEnter Three Numbers: ");
     
       Lone = in.nextInt();
       Ltwo = in.nextInt();
       Lthree = in.nextInt();
       
       
       
       if (Lone > Ltwo && Lone > Lthree)System.out.println("Largest is: " + Lone);
       else if (Ltwo > Lone && Ltwo > Lthree)System.out.println("Largest is: " + Ltwo);
       else if (Lthree > Lone && Lthree >Ltwo)System.out.println("Largest is: " + Lthree);
       
    }
    
}
