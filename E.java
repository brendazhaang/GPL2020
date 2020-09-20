import java.util.Scanner;
public class E
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String genes = input.next();
		
		int count = 0;
		for (int i = 0; i < n - 2; i++)
		{
			outerloop:
			for (int j = i + 3; j <= n; j++)
			{
				String substring = genes.substring(i, j);
				String reverse = new String();
				
				for (int k = substring.length() - 1; k >= 0; k--)
				{
					reverse += substring.charAt(k);
				}
				
				if (reverse.compareTo(substring) == 0)
					count++; 
			}
		
		}
		System.out.println(count);
	}

}
		
		