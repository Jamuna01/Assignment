/*
 * Write a program to print the factorial number of given numbers.
 */
import java.util.Scanner;
public class Question24 
{
	public void factorial(int num)
	{
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact = fact*i;
		}
		System.out.printf("Factorial of %d is: %d ", num, fact);
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question24 ques = new Question24();
		
		System.out.printf("Enter number you want to know the factorial of: ");
		int num = console.nextInt();
		
		ques.factorial(num);
		
		
	}
}
