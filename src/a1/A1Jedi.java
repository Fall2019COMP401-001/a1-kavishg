package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int count[] = new int[items];
		int total_quantity[] = new int[items];
		
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
					{	
						BoughtPrice[j] = price[k];
						count[k]++;
						total_quantity[k]=total_quantity[k]+quantity[j];
					}
				}
				
			}	
			
		}
		scan.close();
		
		for(int i=0; i<items; i++)
		{
			if(count[i]==0)
			{
				System.out.println("No customers bought "+ItemName[i]);
			}
			else
			{
				System.out.println(count[i]+" customers bought "+total_quantity[i]+" "+ItemName[i]);
			}
		
		}
	}
}
		
		