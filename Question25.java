/*
 * Write a program that prompts the user to enter the number of students and each student's name and score. Finally
 * display the student with highest score.
 */
import java.util.Scanner;
public class Question25 
{
	static Scanner console = new Scanner(System.in);
	public void StdDetail(int numOfStudents)
	{
		int highestScore = 0;
		String highestName = "";
		for(int i = 0; i < numOfStudents; i++)
		{
			System.out.printf("Please enter name: ");
			String name = console.next();
			System.out.printf("Please enter score: ");
			int score = console.nextInt();
			
			if(score > highestScore)
			{
				highestName = name;
				highestScore = score;
			}
		}
		System.out.printf("Student name %s got highest score of %d.\n", highestName, highestScore);
	}
	public static void main(String[] args)
	{
		Question25 ques = new Question25();
		
		System.out.printf("Please enter the number of students: ");
		int num = console.nextInt();
		
		ques.StdDetail(num);
		
		
	}
}
