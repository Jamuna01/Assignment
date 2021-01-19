/*
 * Write a program to trap the exception handling to trap 
 * the divided by zero and out of index value in array.
 */
import java.util.Scanner;
public class Question43 
{
	public void exceptionHandling(int num1, int num2)
	{
		try
		{
		int divide = num1/num2;
		System.out.printf("%d ", divide);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		try
		{
			int[] arr = new int[2];
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question43 ques = new Question43();
		
		System.out.printf("Please enter num 1: ");
		int num1 = console.nextInt();
		
		System.out.printf("Please enter num 2: ");
		int num2 = console.nextInt();
		
		ques.exceptionHandling(num1, num2);
		
	}
}
