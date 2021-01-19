/*
  * Write a Program to display names in 
 * 
 * short form. E.g. Ram Kishore Singh  -> R. k. Singh

 */
import java.util.Scanner;
public class Question39
{
	public void nameShortForm()
	{
		String name = "Ram Kishore Singh";
		
		int len = name.length();
		name = name.trim();
		
		String word1 = "";
		for(int i = 0; i < len; i++)
		{
			char ch = name.charAt(i);
		
		if(ch != ' ')
		{
			word1 = word1 + ch;
		}
		else
		{
			System.out.print(Character.toUpperCase(word1.charAt(0)) + ". ");
			word1 = "";
		}
		}
		String word2 = "";
		for(int j = 0; j < word1.length(); j++)
		{
			if(j == 0)
			{
				word2 = word2 + Character.toUpperCase(word1.charAt(0));
			}
			else
			{
				word2 = word2 + Character.toLowerCase(word1.charAt(j));
			}
		}
		System.out.println(word2);
	}
	public static void main(String[] args)
	{
		Question39 ques = new Question39();
		
		ques.nameShortForm();
		
		
	}
}
