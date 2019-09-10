import java.util.Scanner;

public class Exercise2 
{
  public Exercise2()
  {
      
    Scanner in = new Scanner (System.in);
	 //Display int
	 System.out.println("Bill Robinsons");
         System.out.println("Gross Ammount: ");
         double grossAmount = in.nextDouble();
         
	//compute
        double stateTax = grossAmount * 0.035;
        double fedTax = grossAmount * 0.15;
        double SecurityTax = grossAmount * 0.0575;
        double medicare = grossAmount * 0.0275;
        double pensionPlan = grossAmount * 0.05;
        double healthInsurance = 75.00;
        double netPay = fedTax + SecurityTax + medicare + pensionPlan + healthInsurance + stateTax;
        double result2 = grossAmount - netPay;
        
        //Display out
        System.out.println("Bill Robinsons");
        System.out.println("Gross Amount: "+ grossAmount);
        System.out.println("Federal Tax : " + fedTax);
        System.out.println("State Tax :  " + stateTax);
        System.out.println("Social Security Tax :  " + SecurityTax);
        System.out.println("Medicare Tax : " + medicare);
        System.out.println("Pension Plan; " + pensionPlan);
        System.out.println("Health Insurance : " + healthInsurance);
	System.out.println("Net Pay $: " + result2);

       
  }
	public static void main(String[] args) 
	{
		new Exercise2();

	}

}