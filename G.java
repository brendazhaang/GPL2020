import java.util.Scanner;
public class G
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = input.nextInt();
		}
		int count = 0;
		
		
		outerloop:
		for (int i = 0; i < n; i++)
		{
			for (int j = n - 1; j > 0; j--)
			{
				if(a[i] == 1)
					continue outerloop;
				else if (a[i] == 2)
				{
					if (a[j] == 1 && j > i)
					{
						a[i] = 1;
						a[j] = 2;
						count++;
					}
				}
				else if (a[i] == 3 && j > i)
				{
					if (a[j] == 1)
					{
						a[i] = 1;
						a[j] = 3;
						count++;
					}
					else if (a[j] == 2)
					{
						a[i] = 2;
						a[j] = 3;
						count++;
					}
				}
			}
			
		}
		
		
		System.out.println(count);
	}
}
		