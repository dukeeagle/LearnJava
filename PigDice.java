import public.util.Scanner;

public class PigDice
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int roll, total1, total2, turnTotal;
		String choice = "";
		
		total1 = 0
		total2 = 0
		
		do
		{
			turnTotal = 0;
			System.out.println( "You have " + total1 + " points." );
			
			do
			{
				roll1 = 1 + (int)(Math.random()*6);
				System.out.println( "\tYou rolled a " + roll + "." );
				if ( roll == 1 )
				{
					System.out.println( "\tThat ends your turn." );
					turnTotal = 0;
				}
				else
				{
					turnTotal += roll;
					System.out.println( "\tYou have " + turnTotal + " points so far this round." );
					System.out.print( "\tWould you like to \"roll\" agin or \"hold\"? " );
					choice = keyboard.next();
				}
			} while ( roll != 1 && choice.equals("roll") );
		
			total += turnTotal;
			System.out.println( "\tYou end the round with " + total1 + " points."
		}
		
		
		
			
		
	}
}