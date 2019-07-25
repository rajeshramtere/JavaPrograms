
public class PalindromeNumber {

	public static void main(String args[])
	{
		int number = 12321;
		int originalNumber = 0;
		int reverseNumber = 0;
		int remainder = 0;
		
		originalNumber = number;
		
		while(number != 0)
		{
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number / 10;
		}
		
		if(originalNumber == reverseNumber)
		{
			System.out.println(originalNumber + " is a palindrome number.");
		}
		else
		{
			System.out.println(originalNumber + " is not a palindrome number.");
		}
	}
}
