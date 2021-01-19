/*
 * Write a program to print the table of given numbers.
 */
import java.util.Scanner;
public class Question22 
{
	public void printTable(int table)
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.printf("%d * %d = %d\n",table, i, table * i);
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question22 ques = new Question22();
		System.out.printf("enter number you want to see the table of: ");
		int table = console.nextInt();
		ques.printTable(table);
		
		
	}
}

