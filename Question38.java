/*
 * Write a program to check whether a given 
 * string is palindrome or not.
 */
import java.util.Scanner;
public class Question38 
{
	public void palindrome(String word)
	{
		String rev = "";
		int length = word.length();
		
		for(int i = length - 1; i >= 0; i--)
		{
			rev = rev + word.charAt(i);
		}
		if(word.equals(rev))
		{
			System.out.printf("%s is a palindrome.\n", word);
		}
		else
		{
			System.out.printf("%s is not a palindrome.\n", word);
		}
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		Question38 ques = new Question38();
		
		System.out.printf("Please enter a word: ");
		String word = console.nextLine();
		
		ques.palindrome(word);
	}
}
