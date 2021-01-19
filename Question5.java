//5. Write a program to find the area of a circle, rectangle, and triangle
import java.util.Scanner;
public class Question5 
{
	static Scanner console = new Scanner(System.in);
	public double areaCircle(double radius)
	{
		double pi = 3.14;
		double result = pi*radius*radius;
		
		return result;
	}
	public double areaRectangle(double we, double len)
	{
		double result = we*len;
		
		return result;
	}
	public double areaTriangle(double base, double height)
	{
		double result = base*height / 2;
		
		return result;
	}
	public static void main(String[] args)
	{
		Question5 ar = new Question5();
		
		System.out.printf("Please enter the radius of circle: ");
		double rad = console.nextDouble();
		
		System.out.printf("Please enter the Width of rectangle: ");
		double w = console.nextDouble();
		
		System.out.printf("Please enter the height of rectangle: ");
		double h = console.nextDouble();
		
		System.out.printf("Please enter the base of triangle: ");
		double base = console.nextDouble();
		
		System.out.printf("Please enter the height of triangle: ");
		double he = console.nextDouble();
		
		double areaofcircle = ar.areaCircle(rad);
		double areaofRectangle = ar.areaRectangle(w, h);
		double areaofTriangle = ar.areaTriangle(base, he);
		
		System.out.printf("\nArea of Circle: %.2f\n", areaofcircle);
		System.out.printf("Area of Rectangle: %.2f\n", areaofRectangle);
		System.out.printf("Area of Triangle: %.2f\n", areaofTriangle);
		
	}
}
		