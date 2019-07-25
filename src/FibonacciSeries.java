
public class FibonacciSeries {
	
	public static void main(String args[])
	{
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		
		int iterationVariable = 15;
		
		for(int i=0; i<iterationVariable; i++)
		{
			System.out.print(number1 + " ");
			
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;	
		}		
	}

}
