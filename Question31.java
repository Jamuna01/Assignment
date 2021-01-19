//31. Write a program display following patterns. 
public class Question31 
{
	public void pattern()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j < i+1; j++)
			{
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}
	public static void main(String[] args)
	{
		Question31 dp  = new Question31();
		dp.pattern();
	}
}
