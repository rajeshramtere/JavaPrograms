import java.util.Scanner;

public class SwapingOfVariablesWithoutUsingThirdVariable {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		
		System.out.println("Enter the number1 : ");
		number1 = in.nextInt();
		
		System.out.println("Enter the number2 : ");
		number2 = in.nextInt();
		
		System.out.println("\nBefore swaping Number1 = " +number1+ " and Number2 = " +number2);
		
		System.out.println();
		System.out.println("********Swapping of Variables Without Using Third Variable************");
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("\nAfter swaping Number1 = " +number1+ " and Number2 = " +number2);
	}
}
