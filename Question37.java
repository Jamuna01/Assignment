//37. Write a Program to perform for the following task.


public class Question37 
{
	public void addArray(int[][] arr, int[][] num)
	{
		 arr = new  int[3][3];
		 num = new int[3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		num[0][0] = 4;
		num[0][1] = 5;
		num[0][2] = 6;
		
		num[1][0] = 2;
		num[1][1] = 7;
		num[1][2] = 8;
		
		num[2][0] = 3;
		num[2][1] = 1;
		num[2][2] = 9;
		
		for(int i = 0; i <3; i++)
		{
			for(int j = 0; j <3; j++)
			{
				int result = arr[i][j] + num[i][j];
				System.out.printf("%-4d ", result);
			}
			System.out.printf("\n");
		}
		
		
	}
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
		int[][] num = new int[3][3];
		Question37 aA = new Question37();
		aA.addArray(arr, num);
	}
}
