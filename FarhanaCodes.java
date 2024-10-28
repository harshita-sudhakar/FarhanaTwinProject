import java.util.*;
public class FarhanaCodes
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("What size array you want? ");
		int size = reader.nextInt();

		//Part 1
		int[][] squareArray = SquareArray(size);

		//Part 2
		System.out.println(Array2DAnalyzer(squareArray));

	}

	public static int[][] SquareArray(int size)
	{
		int[][] squareArray = new int[size][size];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				squareArray[i][j] = (int)(Math.random() * 9)+ 1;
			}
		}

		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(squareArray[i][j] + " ");
			}
			System.out.println();
		}

		return squareArray;
	}

	public static int Array2DAnalyzer(int[][] array)
	{
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[0].length; j++)
			{
				if(array[i][j] %2 == 0)
					return array[i][j];
			}
		}
		return -1;
	}


}