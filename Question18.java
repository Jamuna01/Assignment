//Write a program to display the largest number from given three values.
import java.util.Scanner;
public class Question18 
{
	//Creating method to find largest value 
	public void largestNum(int x, int y, int z)
	{
		//checking if x is greater than y and z
		if(x > y  && x > z)
		{
			System.out.printf("The largest number is %d ", x);
		}
		//checking if y is greater
		else if(y > z)
		{
			System.out.printf("The largest number is %d ", y);
		}
		//else z is greater 
		else 
		{
		System.out.printf("The largest number is %d ", z);
	}
}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question18 Q8 = new Question18();
		
		System.out.printf("Please enter the first number: ");
		int x = console.nextInt();
		System.out.printf("Please enter the second number: ");
		int y = console.nextInt();
		System.out.printf("Please enter the third number: ");
		int z = console.nextInt();
		
		Q8.largestNum(x, y, z);
		
		
		
		
	}
}
