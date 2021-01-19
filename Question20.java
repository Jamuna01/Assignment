/*Write a program to create the equivalent of a 
 * four-function calculator. The program to enter 
 * two integer’s numbers and an operator. It then 
 * carries out the specified arithmetic operator 
 * operation: addition, subtraction, multiplication 
 * or division of the two numbers. Finally, it 
 * displays the result.
 */
import java.util.Scanner;
public class Question20 
{
	public double arithOperation(double num1, double num2, String ch)
	{
		if(ch.equals("*"))
		{
			return num1 * num2;
		}
		if(ch.equals("/"))
			{
			return num1 / num2;
			}
		if(ch.equals("+"))
		{
			return num1 + num2;
		}
		if(ch.equals("-"))
		{
			return num1 - num2;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question20  ques = new Question20();
		
		System.out.printf("Please enter the first number: ");
		int num1 = console.nextInt();
		
		System.out.printf("Please enter the second number: ");
		int num2 = console.nextInt();
		
		System.out.printf("\nPlease enter the arithmetic operation you want to perform: ");
		String  operation = console.next(); 

		
		double result = ques.arithOperation(num1, num2, operation);
		System.out.printf("%d %s %d = %.2f ",num1, operation, num2, result );
		
		
		
	}
}
