/*
 * Write a Program to accept three sides of a 
 * triangle and display which kind of triangle is 
 * formed.
 */
import java.util.Scanner;
public class Question19 
{
	public void triangle(int x, int y, int z)
	{
		//if all sides are equal
		if(x == y && y == z && z == x)
		{
			System.out.printf("The triangle is Equilateral triangle.\n");
			
		}
		//if any two sides are equal
		else if(x == y || y == z || z == x)
		{
			System.out.printf("The triangle is Isosceles triangle.\n");
		}
		//if none of its sides are equal 
		else
		{
			System.out.printf("The triangle is Scalene triangle.\n");
		}
	}
	public static void main(String[] args)
	{
		Question19 ques = new Question19();
		
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Please enter first side of a triangle: ");
		int side1 = console.nextInt();
		
		System.out.printf("Please enter second side of a triangle: ");
		int side2 = console.nextInt();
		
		System.out.printf("Please enter third side of a triangle: ");
		int side3 = console.nextInt();
		System.out.printf("\n=====================================\n");
		ques.triangle(side1, side2, side3);
		
		
	}
}
