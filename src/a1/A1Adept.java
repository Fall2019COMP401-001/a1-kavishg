package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int items = scan.nextInt();
		String ItemName[] =  new String[items];
		double price[] = new double[items];
		
		for(int i=0; i<items; i++)
		{
			ItemName[i]=scan.next();
			price[i] = scan.nextDouble();			
		}
		
		int customers = scan.nextInt();
		String first[] = new String[customers];
		String last[] = new String[customers];
		double price_total[] = new double[customers];
		
		for(int i=0; i<customers; i++)
		{
			first[i] = scan.next();
			last[i] = scan.next();
			
			int ItemsBought = scan.nextInt();
			int quantity[] = new int[ItemsBought];
			String BoughtItemName[] = new String[ItemsBought];
			double BoughtPrice[] = new double[ItemsBought]; 
			
			for(int j=0; j<ItemsBought; j++)
			{
				quantity[j]=scan.nextInt();
				BoughtItemName[j] = scan.next();
				for(int k=0; k<ItemName.length; k++)
				{
					if(BoughtItemName[j].equals(ItemName[k]))	
						BoughtPrice[j] = price[k];
				}
				
			}	
			price_total[i]=compute_total(quantity,BoughtPrice);
		}
		scan.close();
		
		int biggest_index = maximum(price_total);
		int smallest_index = minimum(price_total);
		String biggest_value = String.format("%.2f", price_total[biggest_index]);
		String smallest_value = String.format("%.2f", price_total[smallest_index]);
		String average_value = String.format("%.2f", average(price_total) );
		
		System.out.println("Biggest: "+first[biggest_index]+" "+last[biggest_index]+" ("+biggest_value+")");
		System.out.println("Smallest: "+first[smallest_index]+" "+last[smallest_index]+" ("+smallest_value+")");
		System.out.println("Average: "+average_value);
		
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
	
	public static int maximum(double price_total[])
	{
		double max = price_total[0];
		int index=0;
		for(int i=1; i<price_total.length; i++)
		{
			if(price_total[i]>max)
			{
				max=price_total[i];
				index=i;
			}
							
		}
		return index;
	}
	
	public static int minimum(double price_total[])
	{
		double min = price_total[0];
		int index=0;
		for(int i=1; i<price_total.length; i++)
		{
			if(price_total[i]<min)
			{
				min=price_total[i];
				index=i;
			}
		}
		return index;
	}
	 
	public static double average(double price_total[])
	{
		double sum=0.0;
		for(int i=0; i<price_total.length; i++)
		{
			sum=sum+price_total[i];
		}
		double average = sum/price_total.length;
		return average;
	}
	
	}
