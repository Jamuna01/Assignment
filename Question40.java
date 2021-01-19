//Write a program to reverse the string.
import java.util.Scanner;
public class Question40 
{
	public void reverseString(String word)
	{
		int length = word.length();
		System.out.printf("Reverse String: ");
		for(int i = length; i > 0; i--)
		{
			System.out.print(word.charAt(i-1));
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question40 ques = new Question40();
		
		System.out.printf("Please enter a word: ");
		String word = console.next();
		
		ques.reverseString(word);
		
	}
}
