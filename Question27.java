/*
 * Write a program to sum each digit of given number as well as product. //456 => 4*5*6 
 * and 4+5+6
 */
import java.util.Scanner;
public class Question27
{
	public void sumAndProduct(double num1,double num2, double num3)
	{
		double sum = num1 + num2 + num3;
		System.out.printf("Sum: %.2f + %.2f + %.2f = %.2f .\n", num1, num2, num3, sum);
		
		double product = num1 * num2 * num3;
		System.out.printf("Product: %.2f * %.2f * %.2f = %.2f .\n", num1, num2, num3, product);
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question27 ques = new Question27();
		
		System.out.printf("Please enter number 1: ");
		double num1 = console.nextDouble();
		
		System.out.printf("Please enter number 2: ");
		double num2 = console.nextDouble();
		
		System.out.printf("Please enter number 3: ");
		double num3 = console.nextDouble();
		
		System.out.printf("==================\n");
		ques.sumAndProduct(num1, num2, num3);
		
		
		
	}
}
