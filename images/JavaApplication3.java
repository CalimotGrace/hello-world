import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        int numbers;
        int sum;
      
        numbers = in.nextInt(); 
        
        if (numbers < 0)
            numbers = -numbers;
        sum = 0;

        while (numbers > 0) 
        {
            sum = sum + numbers % 10;           
            numbers = numbers / 10;                
        }
        System.out.println(sum);
    }
    
}
