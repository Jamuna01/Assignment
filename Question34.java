//34. Write a program to reverse the element of an array.
public class Question34
{
	public void reverseElement(int[] num, int size)
	{
		int[] arr = new int[size];
		int j = size;
		System.out.printf("Reverse elements are: \n");
		
		for(int i = 0; i < num.length; i++)
		{
			arr[j - 1] = num[i];
			
			num[i] = j;
			j = j - 1;
		}
		for(int i = 0; i < num.length; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
	}
	public static void main(String[] args)
	{
		
		int[] num = new int[] {56, 12, 45, 62 ,2};
		Question34 ra = new Question34();
		ra.reverseElement(num, num.length);
			
	}
}
