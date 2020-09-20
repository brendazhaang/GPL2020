import java.util.Scanner;
public class C
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int d = input.nextInt();
		double n = input.nextDouble();
		
		double f1 = input.nextDouble();
		double m1 = input.nextDouble();
		int p1 = input.nextInt();
		
		double f2 = input.nextDouble();
		double m2 = input.nextDouble();
		int p2 = input.nextInt();
		
		double f3 = input.nextDouble();
		double m3 = input.nextDouble();
		int p3 = input.nextInt();
		
		double price1 = f1 + (m1 * d) + ((double)(n *  (p1))/100) + n;
		double price2 = f2 + (m2 * d) + ((double)(n *  p2)/100) + n;
		double price3 = f3 + (m3 * d) + ((double)(n *  p3)/100) + n;
	
		double minPrice = Math.min(price1, Math.min(price2, price3));
		
		if (price1 == minPrice)
		{
			System.out.println("1");
			System.out.printf("%.2f",price1);
		}
		else if (price2 == minPrice)
		{
			System.out.println("2");
			System.out.printf("%.2f",price2);
		}
		else
		{
			System.out.println("3");
			System.out.printf("%.2f",price3);
		}
		
	}
}
		