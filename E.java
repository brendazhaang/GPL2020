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
			
			for (int j = i + 3; j <= n; j++)
			{
				String substring = genes.substring(i, j);
				if (isPalindrome(substring))
					count++;
			}
		
		}
		System.out.println(count);
	}
	
	public static boolean isPalindrome(String substring)
	{
		for (int i = 0; i < substring.length() / 2; i++)
		{
			if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i))
				return false;
		}
		
		return true;
	}

}
		
		