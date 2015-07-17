import java.util.Scanner;

public class RudeQuestions
{
		public static void main(String[] args)
		{
			String name;
			int age;
			double weight, income;
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println( "Hello. What is your name? " );
			name = keyboard.next();
			
			System.out.println( "Hi, " + name + "! How old are you? " );
			age = keyboard.nextInt();
			
			System.out.println( age + "? That's pretty old. " );
			System.out.print( "How much do you weigh, " + name + "? ");
			weight = keyboard.nextDouble();
			
			if (weight <= 120) {
			System.out.println( weight + "? Yikes. So, how much money do you make every year, " + name + "?");
			}
			else {
			System.out.println( weight + "?! I'm surprised you haven't eaten your computer mouse yet. Finally, what's your income, " + name + "?");
			}
			income = keyboard.nextDouble();
			
			System.out.println( "Ouch. If I made " + income + " per year I'd drink myself to death.");
			System.out.println( "Well, thanks for answering my questions, " + name + ".") ;
		}
}