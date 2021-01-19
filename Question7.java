//Write a program that reads the radius and length of a cylinder and computes volume.
import java.util.Scanner;
public class Question7 
{
	public double findVolume(double rad, double len)
	{
		double pi = 3.14;
		
		//using volume of cylinder formula
		 double result =  pi * rad * rad * len ;
		 
		 return result;	
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter the radius of cylinder: ");
		double rad = console.nextDouble();
		
		System.out.printf("Please enter the length of cylinder:");
		double len = console.nextDouble();
		
		Question7 cv = new Question7();
		double result  = cv.findVolume(rad, len);
		
		System.out.printf("\nVolume of Cylinder: %.2f", result);
	}
}
