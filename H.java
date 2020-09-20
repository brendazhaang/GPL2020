import java.util.Scanner;
public class H
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		
		int r = input.nextInt() + 1;
		int s = input.nextInt() + 1;
		
		int[][] hospital = new int[m][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				hospital[i][j] = input.nextInt();
			}
		}
		
		
		int minSwaps = 10000000;
		int swaps1 = 0;
		int swaps2 = 0;
		outerloop:
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = i; k < i + r; k++)
				{
					for (int l = j; l < j + s; l++)
					{
						if (k > hospital.length - 1 || l > hospital.length - 1)
							continue outerloop;
						
						if (hospital[k][l] == 0)
							continue;
						
						else
						{
							swaps1++;
						}
						
					}
				}
				
				for (int k = j; k < j + s; k++)
				{
					for (int l = i; l < i + r; l++)
					{
						if (hospital[k][l] == 0)
							continue;
						
						else
							swaps2++;
						
					}
				}
				
				minSwaps = Math.min(Math.min(minSwaps,swaps1), swaps2);
				
			}
		}
		System.out.println(minSwaps);	
	}
}
		