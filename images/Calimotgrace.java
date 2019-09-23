import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

public class Calimotgrace {

    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        long numPhone, remainder;
        long firstpart, secondpart, thirdpart;
      
        
    System.out.println("Enter a 10-digit numbers: ");
    numPhone = in.nextLong();
    firstpart = numPhone/10000000;
    remainder = numPhone%10000000;
    secondpart = remainder/100000;
    thirdpart = remainder%100000;
    
    if(firstpart == 800 || firstpart == 888 || firstpart == 877 || firstpart == 866)
    {
        System.out.println(firstpart + "-" + secondpart + "-" + thirdpart + "is a toll-free number ");
    }
    else
    {
        System.out.println(firstpart + "-"  + secondpart + "-" + thirdpart + " is a toll-free number " );
    }
        
   
        Random random = new Random ();
       
        int comp;
        
        comp= random.nextInt(3);
        
    //display
        System.out.println("Rock: 0; Scissors: 1; Paper: 2 --");
        System.out.println("Choose: ");
        int player = in.nextInt();
        System.out.println("The Computer Chooses " + comp);
        System.out.println("*****************************");
        
        if (player == 0){
            System.out.println("Player: Rock");
        }
        if (comp == 0){
            System.out.println("Computer: Rock");
        }
        if (player == 1){
            System.out.println("Player:Scissors");
        }
        if (comp == 1){
            System.out.println("Computer:Scirssorrs");
        }
        if (player == 2){
            System.out.println("Player: Paper");
        }
        if (comp == 2){
            System.out.println("Computer: Paper");
        }
      //endif
        if (player == 0 && comp == 0){
            System.out.println("It's a tie!");
        }
        else if (player == 1 && comp == 1){
            System.out.println("It's a tie!");
        }
        else if (player == 2 && comp == 2){
            System.out.println("It's a tie!");
        }
        else if (player == 0 && comp == 1){
            System.out.println ("Player Wins!");
        }
        else if (player == 1 && comp == 0){
            System.out.println ("Computer Wins!");
        }
        else if (player == 0 && comp == 2){
            System.out.println("Computer Wins!");
        }
        else if (player == 2 && comp == 0){
            System.out.println("Player Wins!");
        }
        else if (player == 1 && comp== 0){
            System.out.println("Computer Wins!");
        }
        else if (player == 1 && comp == 0){
            System.out.println("Player Wins!");
        }
        else if (player == 0 && comp == 1){
            System.out.println("Computer Wins!");
        }
        else if (player == 1 && comp == 2){
            System.out.println("Player Wins!");
        }
        else if (player == 2 && comp == 1){
            System.out.println("Computer Wins!");
        }
    }
    
}
