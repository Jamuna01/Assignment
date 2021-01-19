//36. Write a function to find duplicate elements in an array.
import java.util.Scanner;

public class Question36 
{
	public static Scanner console = new Scanner(System.in);
	public void userInput(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf("Enter %d element: ", i+1);
			num[i] = console.nextInt();
		}
	}
	public void element(int[] arr)
	{
		System.out.printf("\nDuplicate elements are: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.printf("%d ", arr[j]);
				}
				
			}
		}		
	}
	public static void main(String[] args)
	{
		System.out.printf("Please enter the size of the elements: ");
		int size = console.nextInt();
		
		int[] arr = new int[size];
		
		Question36 de = new Question36();
		
		de.userInput(arr);
		de.element(arr);
		
	}
}
