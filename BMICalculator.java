import java.util.Scanner;

public class BMICalculator
{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			double m, kg, bmi;
			
			System.out.println("What is your height in meters?");
			m = keyboard.nextDouble();
			
			System.out.println("What is your weight in kilograms?");
			kg = keyboard.nextDouble();
			
			bmi = kg / (m*m);
			
			System.out.println( "Your BMI is " + bmi);
		}


}