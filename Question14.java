/*Write a program to relate two integers 
 * entered by the user using = =or > or < sign.
 */
import java.util.Scanner;
public class Question14 
{
	public void relateNum(int num1, int num2)
	{
		if(num1 == num2)
		{
			System.out.printf("Both numbers are equal.\n");
		}
		else if( num1 > num2)
		{
			System.out.printf("Entered number %d is greater.\n", num1);
		}
		else
		{
			System.out.printf("Entered number %d is greater\n", num2);
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question14 ques = new Question14();
		
		System.out.printf("Please enter number 1: ");
		int num1 = console.nextInt();
		
		System.out.printf("Please enter number 2: ");
		int num2 = console.nextInt();
		
		ques.relateNum(num1, num2);
		
		
	}
}
