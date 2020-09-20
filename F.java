import java.util.Scanner;
public class F
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		
		
		int[] times = new int[n];
		for (int i = 0; i < n; i++)
		{
			times[i] = input.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += times[i];
		}
		
		System.out.println((sum / k) + 1);
		
	}
}
	