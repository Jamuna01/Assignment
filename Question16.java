/* 16.  Write a program to find the given number is even or odd. */ 
import java.util.Scanner;
public class Question16 
{
	public void evenOrOdd(int num)
	{
		
			if(num % 2 == 0)
			{
				System.out.printf("%d is even.", num);
			}
			else
			{
				System.out.printf("%d is Odd.", num);
			}	
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Enter the number you want to check:" );
		int num = console.nextInt();
		
		
		Question16 eo = new Question16();
		
		eo.evenOrOdd(num);	
		

	}
}
