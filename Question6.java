import java.util.Scanner;

//6. Write a program to find the perimeter of a circle, triangle, and rectangle.
public class Question6 
{
	static Scanner console = new Scanner(System.in);
	public double periCircle(double radius)
	{
		double pi = 3.14;
		double result = 2*pi*radius;
		
		return result;
	}
	public double periRectangle(double len, double we)
	{
		double result = 2 *(len + we);
		
		return result;
	}
	public double periTriangle(double len, double bre, double hei)
	{
		double result = len + bre + hei;
		
		return result;
	}
	public static void main(String[] args)
	{
		Question6 peri = new Question6();
		
		System.out.printf("Please enter the radius of circle: ");
		double rad = console.nextDouble();
		
		System.out.printf("Please enter the length of rectangle: ");
		double l = console.nextDouble();
		
		System.out.printf("Please enter the width of rectangle: ");
		double w = console.nextDouble();
		
		System.out.printf("Please enter the length of triangle: ");
		double len = console.nextDouble();
		
		System.out.printf("Please enter the breadth of triangle: ");
		double bre = console.nextDouble();
		
		System.out.printf("Please enter the height of triangle: ");
		double hei = console.nextDouble();
		
		
		
		double perimeterOfCircle = peri.periCircle(rad);
		double perimeterOfRectangle = peri.periRectangle(l, w);
		double perimeterOfTriangle = peri.periTriangle(len, bre, hei);
		
		System.out.printf("\nPerimeter of Circle: %.2f\n", perimeterOfCircle);
		System.out.printf("Perimeter of Rectangle: %.2f\n", perimeterOfRectangle);
		System.out.printf("Perimeter of Triangle: %.2f\n", perimeterOfTriangle);
		
		
		
		
	}
}


