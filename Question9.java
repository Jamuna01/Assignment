/*Write a program that converts pounds into kg. 
 * The program prompts the user to enter a number of pounds, 
 * converts it to kg and displays the result 
 * [1 pound is 0.454 kg].
 */
import java.util.Scanner;
public class Question9
{
	public double  poundsInToKg(double numOfPounds )
	{
		// converting into kgs here
		double result = 0.454 * numOfPounds; 
		
		return result;
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		//asking user input to convert the number of pounds 
		System.out.printf("Please enter pounds you want to convert into kg: ");
		double convertPounds = console.nextDouble();
		
		Question9 ques = new Question9();
		double result = ques.poundsInToKg(convertPounds);
		System.out.printf("%.2f pounds is equal to %.2f kgs\n", convertPounds, result);
		
	}
}
