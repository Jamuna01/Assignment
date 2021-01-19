//30.Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
import java.util.Scanner;
public class Question30 
{
	public void fibSeries(int size)
	{
		int a = 0; 
		int b = 1;
		int c;
		System.out.printf("%d %d ", a, b);  
		for(int i = 2; i < size; i++ )
		{
			c = a + b;
			System.out.printf("%d ", c);
			
			a = b;
			b = c;
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter the number to want to print up to:");
		int num = console.nextInt();
		
		Question30 fs = new Question30();
		fs.fibSeries(num);
	}
}
