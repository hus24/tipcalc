import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class tipcalc {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		//int guess=1;
		
		String fin = ("yes");
		while(fin.equals("yes")) {
			System.out.print("Total bill: $");
			Scanner input = new Scanner(System.in);
			float total= input.nextFloat();
			
			System.out.print("What percentage would you like to tip? ");
			
			float tip= input.nextFloat();
			float tips = (tip/100)*total;
			
			float totaled = tips+total;
			System.out.println("the amount of tip is $"+df.format(tips)+"\nthe total bill including tip is "+df.format(totaled));
			
			System.out.print("How many people would you like to spilt the bill with? ");
			
			int ppl=  input.nextInt();
			
			float eachperson = totaled/ppl;
			System.out.println("each person has to pay $"+df.format(eachperson));
			
			
			System.out.println("\nWould you like to play again? y/n");
			input.nextLine();
			fin= input.nextLine();
			
			
			
			
	
		}}
}
