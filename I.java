import java.util.Scanner;
public class I
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int p = input.nextInt();
		
		int[] produced = new int[n];
		for (int i = 0; i < k; i++)
		{
			produced[i] = input.nextInt();
		}
		
		for (int i = k; i < n; i++)
			produced[i] = 0;
		
		int sum = 1;
		for (int i = 0; i < n; i++)
		{
			if (produced[i] == 0)
			{
				for (int j = i - k; j < i; j++)
				{
					sum *= produced[j];
				}
				produced[i] = sum;
				sum = 1;
			}
		}
		if (produced[n - 1] > p)
			System.out.println(produced[n - 1] % p);
		else
			System.out.println(produced[n-1]);
	}
}
		
		