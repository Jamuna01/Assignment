/*
 * Write a program to find the duplicate letter in a word.
 */
import java.util.Scanner;
public class Question41 
{
	public void dupLetter(String name)
	{
		char[] arr = name.toCharArray();
		int count=0;
		System.out.printf("Duplicate characters are: ");
		for(int i = 0; i < name.length(); i++)
		{
			for(int j = i+1; j < name.length(); j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j] + " ");
					count++;
					break;
					
				}
			}
			
			
		}
		
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter name: ");
		String name = console.nextLine();
		
		Question41 ques = new Question41();
		ques.dupLetter(name);
	}
}
