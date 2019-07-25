import java.util.Scanner;

public class FloydTriangle {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int rows = 0;
		int number = 1;
		
		System.out.println("Enter the number of rows : ");
		rows = in.nextInt();
		
		System.out.println("********Floyd Triangle************");
		System.out.println();
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
