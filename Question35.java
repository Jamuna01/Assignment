//35.Write a function to find the second largest number in a given array.
import java.util.Scanner;
public class Question35 
{
	public static Scanner console = new Scanner(System.in);
	public static void seclar(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf("Enter element %d: ", i+1);
			num[i] = console.nextInt();
		}
	}
	public static void findElement(int[] num)
	{
		int res = 0;
		for(int i = 0; i < num.length; i++)
		{
			for(int j = i+1; j < num.length; j++)
			{
				if(num[i] > num[j])
				{
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				}
			}
		}
		
		for(int a = 0; a < num.length; a++)
		{
			System.out.printf("%d ", num[a] );		
		}
		System.out.printf("\nSecond largest element: %d ", num[num.length-2]);
		
		
	}
	public static void main(String[] args)
	{
		System.out.printf("Enter the size of the array:");
		int size = console.nextInt();
		int[] arr = new int[size];
		
		Question35 sln = new Question35();
		sln.seclar(arr);
		sln.findElement(arr);
		
	}
}
