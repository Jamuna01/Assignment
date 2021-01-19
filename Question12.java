/* Write a program to accept the roll, name, 
 * and nationality of the person and display those values in good format.
 */
import java.util.Scanner;

public class Question12 
{
	static Scanner console = new Scanner(System.in);
	public void displayDetails()
	{
			System.out.printf("Please enter the roll num: ");
			int roll = console.nextInt();
			
			System.out.printf("Please enter the name: ");
			String name = console.next();
			
			console.nextLine();
			System.out.printf("Please enter the nationality: ");
		    String nationality = console.nextLine();
			
			System.out.printf("\n========================= \n");
			System.out.printf("Roll \t Name \t Nationality \n");
			
			System.out.printf("%d \t %s \t %s\n", roll, name, nationality);
			
	
	}
	public static void main(String[] args)
	{
		
		Question12 ques = new Question12();
		ques.displayDetails();
		
	}
}
