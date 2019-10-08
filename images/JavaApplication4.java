import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       
       System.out.println("Input: ");
       String input = in.nextLine();
       
       int count = 0;
       
       for (int i = 0; i< input.length (); i++)
       {
           if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' ||
                   input.charAt(i) == 'o' || input.charAt(i) == 'u')
       
       {
       
           count++;
       }
       }
           
           
    
     System.out.println ("Output: ");
     System.out.println (count);

}
}