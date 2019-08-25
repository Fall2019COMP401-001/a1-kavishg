package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int customers = scan.nextInt();
		String first[]= new String[customers];
		String last[]= new String[customers];
		int items=0;
		
		
		double price_total[] = new double[customers];
		
		
		for(int i=0; i<customers; i++)
		{
			first[i] = scan.next();
			last[i] = scan.next();
			items = scan.nextInt();		
			
			int quantity[] = new int[items];
			String item[] = new String[items];
			double price[] = new double[items];
			
			for(int j=0; j< quantity.length; j++)
			{
				 quantity[j]=scan.nextInt();
				 item[j] = scan.next();
				 
				 price[j] = scan.nextDouble();		
				 
			}			
			price_total[i] = compute_total(quantity, price);
			
		}
		
		for(int i=0; i<customers; i++)
		{
			
			System.out.println(first[i].charAt(0)+". "+last[i]+": "+price_total[i]);
		}
			
	}

	public static double compute_total(int quantity[], double price[])
	{
		double total=0.00;
		for(int i=0; i<quantity.length; i++)
		{
			total=total+(quantity[i]*price[i]);
		}
		
		return total;
	}
}
