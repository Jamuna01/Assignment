/*11.Write a program to swap two numbers
a) using temp variable
b) without temp variable
*/
import java.util.Scanner;
public class Question11
{
	//a. using temp in this method to swap two numbers
	public void swapWithTemp(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("\nSwap using temp: X: %d  Y: %d\n",x,y);
	}
	//b. Without using temp to swap two number
	public void swapWithoutTemp(int x, int y)
	{
		x = x + y; 
		y = x - y;
		x = x - y;
		System.out.printf("\nSwap without temp: X: %d  Y: %d",x,y);
	}
	public static void main(String[] args)
	{
		//Creating scanner object
		Scanner console = new Scanner(System.in);
		
		Question11 sn = new Question11();
		
		System.out.printf("Please input X value:");
		int x = console.nextInt();
		
		System.out.printf("Please input Y value:");
		int y = console.nextInt();
		
		sn.swapWithTemp(x, y);
		sn.swapWithoutTemp(x, y);
	}
}
