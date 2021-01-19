/*
 * Write a program that receives an ASCII code 
 * (between 0 – 128) and display its character 
 * [example: 97 (input) ->a(output)].
 */
import java.util.Scanner;
public class Question15 
{
	public void asciiCode()
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please enter an ASCII code: ");
		int asciiNum = console.nextInt();
		
		
		//converting ascii code to character == ((char)number)
		System.out.printf("ASCII code of %d is '%c'. \n", asciiNum, (char)(asciiNum) );
	}
	public static void main(String[] args)
	{
		Question15 ques = new Question15();
		ques.asciiCode();
	}
}
