//Write a program to calculate simple interest input by the user. Simple Interest
// = P*T*R/100
import java.util.Scanner;
public class Question4
{
	public static Scanner console = new Scanner(System.in);
	
	public void interest()
	{
		System.out.printf("Enter the amount: ");
		double P = console.nextDouble();
		System.out.printf("Enter the time period: ");
		int T = console.nextInt();
		System.out.printf("Enter the rate: ");
		double R = console.nextDouble();
		
		double result = (double)P*T*R/100;
		System.out.printf("Simple Interest for %d year would be: $%.2f",T, result);
		
	}
	public static void main(String[] args)
	{
		Question4 sI = new Question4();
		sI.interest();
	}
}
