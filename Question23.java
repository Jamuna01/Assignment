/*
 * Write a Program to sum 1 to nth natural numbers.
 */
import java.util.Scanner;
public class Question23 
{
	public void naturalNumber(int num)
	{
		int sum=0;
		for(int i = 0; i <= num; i++)
		{
			sum += i;
		}
		System.out.printf("\nThe sum of natural number from 1 to %d : %d\n", num, sum);
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question23 ques = new Question23();
		
		System.out.printf("Please enter number:");
		int naturalNo = console.nextInt();
		
		ques.naturalNumber(naturalNo);
		
		
	}
}
