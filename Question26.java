/*
 * Write a program to reverse the given number. //123=321
 */
import java.util.Scanner;
public class Question26 
{
	public void reverseNum(int num)
	{
		int reverse = 0;
		while(num != 0) // number cannot be zero
		{
			
			int rev = num % 10; //// rev is finding the remainder
			
			reverse = reverse * 10 + rev; // reverse the number
			num = num / 10; // dividing the remaining number
		}
		//printing the reverse number here
		System.out.printf("Reverse of given number %d ", reverse);
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question26 ques = new Question26();
		
		System.out.printf("Please enter the num: ");
		int num = console.nextInt();
		ques.reverseNum(num);
	}
}
