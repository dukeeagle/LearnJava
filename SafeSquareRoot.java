import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		
		System.out.print("Give me a number, and I shall find the square root of it.");
		System.out.print("(The number can even be negative, if you want!) ");
		x = keyboard.nextDouble();
		
		if ( x < 0 )
		{
			x = Math.abs(x);
			y = Math.sqrt(x);
			System.out.println( "The square root of " + x + " is " + y + "i");
		}
		else
		{
			y = Math.sqrt(x);
			System.out.println("The square root of " + x + " is " + y);
		}
	}
}