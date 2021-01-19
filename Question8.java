//8. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
import java.util.Scanner;
public class Question8 
{
	public double FahrenheitToCelcius(double Faren)
	{
		double cel = (Faren - 32)* 5/9;
		
		return cel;
	}
	public double celciusToFarenheit(double cel)
	{
		double far = (cel * 9/5 ) + 32;
		
		return far;
	}
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Question8 Ques = new Question8();
		
		System.out.printf("Please enter the degree Farenheit to convert to calcius: ");
		double farenheit = console.nextDouble();
		double f = Ques.FahrenheitToCelcius(farenheit);
		System.out.printf("%.2f degree farenheit is %.2f degree celcius.\n",farenheit, f );
		
		
		System.out.printf("\n\nPlease enter the degree celcius to convert to farenheit: ");
		double celcius = console.nextDouble();
		double c = Ques.celciusToFarenheit(celcius);
		System.out.printf("%.2f degree celcius is %.2f degree farenheit.\n",celcius, c );
			
	}
}
