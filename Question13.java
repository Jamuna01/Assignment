/*Write a program to print the number entered by 
 * the user only if the number entered is negative.
 */
import java.util.Scanner;
public class Question13 
{
	
	public void printNumber(int num)
	{
		if(num < 0)
		{
			System.out.printf("Negative enter number: %d", num);
		}
		else
		{
			System.out.printf("Bye Bye!");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please enter the number: ");
		int numbers = console.nextInt();
		Question13 ques = new Question13();
		ques.printNumber(numbers);
		
	}
}

