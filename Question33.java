//33. Write a program to display numbers in ascending order in array.
import java.util.Scanner;
public class Question33 
{
	public static Scanner console = new Scanner(System.in);
	public void userInput(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf("Enter element %d:",i+1);
			num[i] = console.nextInt();
		}
	}
	public void ascendingOrder(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				}
			}
			
		}
		System.out.printf("\nPrinting number in Ascending order:\n");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.printf("%d ", arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		
		System.out.printf("How many elements are there: ");
		int size = console.nextInt();
		
		int[] num = new int[size];
		
		Question33 ao = new Question33();
	     ao.userInput(num);
	     ao.ascendingOrder(num);
		
		
	
	}
}
