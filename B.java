import java.util.Scanner;
public class B
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		int[] shoppers = new int[n];
		for (int i = 0; i < n; i++)
		{
			shoppers[i] = input.nextInt();
		}
		
		int sick = m - 1;
		int count = 0;
		
		for (int i = sick; i < n; i++)
		{
			if (Math.abs(shoppers[i] - shoppers[sick]) < 6 && i != sick)
			{
				count++;
				if (i > sick)
					sick = i;
			}
		}
		sick = m -1;		
		for (int i = sick; i >= 0; i--)
		{
			if (Math.abs(shoppers[i] - shoppers[sick]) < 6 && i != sick)
			{
				count++;
				if (i < sick)
					sick = i;
			}
		}
		
		System.out.println(count);
	}
}
