/*
 * 
 * Write a program to find the duplicate word from a long string.
 */
import java.util.Scanner;
public class Question42 
{
	public void dupLetter(String name)
	{
		name = name.toLowerCase();
		String[] words = name.split(" ");
		int count;
		System.out.printf("Duplicate words are: ");
		for(int i = 0; i < words.length; i++)
		{
			count = 1;
			for(int j = i+1; j < words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "0";
					
				}
			}
			if(count > 1 && words[i] != "0")
				System.out.println(words[i]);
			
		}
		
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter sentence: ");
		String sen = console.nextLine();
		
		Question42 ques = new Question42();
		ques.dupLetter(sen);
}
}
