public class PrimeNumber {

	public static void main(String args[])
	{
		int number = 37;
		boolean isPrime = false;
		
		if(number == 0 || number == 1)
		{
			System.out.println("The entered number is either 0 or 1. Try with different number");
		}
		
		for(int i=2; i<number/2 ; i++)
		{
			if(number % i == 0)
			{
				isPrime = true;
				break;
			}
		}
		
		if(!isPrime)
		{
			System.out.println(number + " is a prime number.");
		}
		else
		{
			System.out.println(number + " is not a prime number.");
		}
	}
}
