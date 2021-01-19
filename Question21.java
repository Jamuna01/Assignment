/*
 * Program to input the number of (1...7) and 
 * translate to its equivalent name of the day 
 * of the week.
 */
import java.util.Scanner;
public class Question21 
{
	public void equivalentWeek(int num)
	{
		if(num == 1)
		{
			System.out.printf("It's Sunday \n");
		}
		else if(num == 2)
		{
			System.out.printf("It's Monday \n");
		}
		else if(num == 3)
		{
			System.out.printf("It's Tuesday \n");
		}
		else if(num == 4)
		{
			System.out.printf("It's Wednesday \n");
		}
		else if(num == 5)
		{
			System.out.printf("It's Thursday \n");
		}
		else if(num == 6)
		{
			System.out.printf("It's Friday \n");
		}
		else if(num == 7)
		{
			System.out.printf("It's  Saturday\n");
		}
		else
		{
			System.out.printf("Sorry Wrong Input!!");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question21 ques = new Question21();
		
		
		System.out.printf("Please input the number from 1 to 7: ");
		int num = console.nextInt();
		
		ques.equivalentWeek(num);
		
		
		
	}
}
