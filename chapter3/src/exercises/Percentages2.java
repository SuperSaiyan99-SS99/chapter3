package exercises;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val1; 
		double val2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first double >> ");
		val1 = input.nextDouble();
		System.out.print("Enter the second double >> ");
		val2 = input.nextDouble();
		
		computePercent(val1, val2);
		computePercent(val2, val1);
	}
	public static void computePercent(double one, double two) {
		double decimalPercent;
		double percent;
		
		decimalPercent = one / two;
		percent = decimalPercent * 100;
		
		System.out.println(one + " is " + percent + " percent of " + two + ".");
	}

}
