//17. Write a program to calculate leap year
import java.util.Scanner;
public class Question17 
{
	public boolean lyear(int year)
	{
		//if the year is divided by 4
		if(year % 4 == 0)
		{
			//if the year is century
			if(year % 100 == 0)
			{
				//if the year is divided by 400
				if(year % 400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		
		}
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please enter the year: ");
		int year = console.nextInt();
		
		Question17 ly = new Question17();
		 if(ly.lyear(year))
			 System.out.printf("%d is a leap year", year);
		 else
			 System.out.printf("%d is a not leap year", year);
		
		
	}
}
