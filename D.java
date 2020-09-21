import java.util.Scanner;
public class D
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[][] stuff = new int[n][2];
		for (int i = 0; i < n; i++)
		{
			stuff[i][0] = input.nextInt();
			stuff[i][1] = input.nextInt();
		}
		int paid = 0;
		//first check if enough
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += stuff[i][1];
		}
		if (sum < k)
			System.out.println("NOT ENOUGH");
		else if (sum == k)
		{
			for (int i = 0; i < n; i++)
			{
				paid += stuff[i][0] * stuff[i][1];
			}
			System.out.println(paid);
		}
		else
		{
			int bought = 0;
			paid = 0;
			int minPrice = stuff[0][0];
			
			for (int i = 0; i < n; i++)
			{
				if (stuff[i][0] < minPrice)
					minPrice = stuff[i][0];	
			}
			
			do
			{
				for (int i = 0; i < n; i++)
				{
					if (stuff[i][0] == minPrice)
					{
						if (bought + stuff[i][1] < k)
						{
							bought += stuff[i][1];
							paid += stuff[i][1] * stuff[i][0];
						}
						else
						{
							paid += (k - bought) * stuff[i][0];
							bought = k;
							break;
						}
					}
				}
				
				int newMinPrice = Integer.MAX_VALUE;
				
			
				for (int i = 0; i < n; i++)
				{
					if (stuff[i][0] < newMinPrice && stuff[i][0] > minPrice)
						newMinPrice = stuff[i][0];
				}
				minPrice = newMinPrice;
				
				
			} while (bought < k);
			System.out.println(paid);
		}
	}
}
		