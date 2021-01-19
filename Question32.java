//32. Write a Program to accept 5 values in an array and display their sum.
import java.util.Scanner;
public class Question32 
{
	public int acceptValue(int[] arr)
	{
		//creating scanner object
		Scanner console = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter num %d:", i +1);
			arr[i] = console.nextInt();
			count += arr[i];
		}
		
		return count;
	}
	public static void main(String[] args)
	{
		
		int[] arr = new int[5];
		
		//creating Array5Value object
		Question32 av = new Question32();
		
		//call the acceptValue method
		int array = av.acceptValue(arr);
		
		//printing total sum here
		System.out.printf("Sum of the given 5 numbers: %d", array);
}
}
