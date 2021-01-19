/*Write a program to find sum and average of two numbers input by User
 * (using Scanner class).
*/
import java.util.Scanner;
public class Question3 
{
	public static void inputFromUser()
	{
		//Scanner Object
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter num 1:");
		int num1 = console.nextInt();
		
		System.out.printf("Please enter num 2:");
		int num2 = console.nextInt();
		
		int sum = num1 + num2; // adding number from user input
		int avg = sum/2;   // average
		
		System.out.printf("Sum: %d\n", sum); //printing sum
		System.out.printf("Average: %d\n", avg); //printing average
	}
	
	public static void main(String[] args)
	{
		
		Question3.inputFromUser();
	}
}