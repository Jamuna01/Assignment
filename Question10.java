//10. Write a Program for the following Mathematical Function.
import java.util.Scanner;
public class Question10 
{
	static Scanner console = new Scanner(System.in);
	public void speed()
	{
		//a.S = ut + 1/2at^2
		System.out.printf("Please enter the intial velocity: ");
		double u = console.nextDouble();
		
		System.out.printf("Please enter the time: ");
		double t = console.nextDouble();
		
		System.out.printf("Please enter the acceleration: ");
		double a = console.nextDouble();
		 
		double S = u * t + 0.5 * a * t * t;
		
		System.out.printf("\nSpeed: %.2f\n", S);
	}
	public void area()
	{
		System.out.printf("\nPlease enter the length: ");
		double a = console.nextDouble();
		
		System.out.printf("Please enter the width: ");
		double b = console.nextDouble();
		
		System.out.printf("Please enter the height: ");
		double c = console.nextDouble();
		
		double S = a + b + c / 2;
		
		double Area = Math.sqrt(S*(S-a)* (S-b)*(S-c));
		
		System.out.printf("\nArea : %.2f \n", Area);
	}
	
	public void Quadratic()
	{
		System.out.printf("\nPlease enter a: ");
		double a = console.nextDouble(); 
		
		System.out.printf("Please enter b: ");
		double b = console.nextDouble();
		
		System.out.printf("Please enter c: ");
		double c = console.nextDouble();
		
		double cal = b*b - 4 * a * c;
		
		if(cal > 0)
		{
			 double root = (-b + Math.sqrt(cal))/ (2 * a);
			System.out.printf("\nQuadratic: %.2f \n", root);
		}
		else if(cal == 0)
		{
			double root = -b / (2 * a);
			System.out.printf("\nQuadratic: %.2f \n", root);	
		}
		else
		{
			double real = -b / (2 * a);
			
			double imaginary = Math.sqrt(-cal) / (2 * a);
			System.out.printf("\nQuadratic: %.2f   %.2f\n", real, imaginary);
		}
	}
	public static void main(String[] args)
	{
		Question10 mf = new Question10();
		
		mf.speed();
		mf.area();
		mf.Quadratic();
	}
}
