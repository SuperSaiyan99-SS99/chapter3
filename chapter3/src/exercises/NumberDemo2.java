package exercises;

import java.util.Scanner;

public class NumberDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first int >> ");
		num1 = input.nextInt();
		System.out.print("Enter the second int >> ");
		num2 = input.nextInt();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2);
	}
	public static void displayTwiceTheNumber(int x, int y) {
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * 2;
		secondNumber = y * 2;
		
		System.out.println("Twice the number: " + firstNumber + ", " + secondNumber);
	}
	public static void displayNumberPlusFive(int x, int y) {
		int firstNumber;
		int secondNumber;
		
		firstNumber = x + 5;
		secondNumber = y + 5;
		
		System.out.println("The number plus 5: " + firstNumber + ", " + secondNumber);
	}
	public static void displayNumberSquared(int x, int y) {
		int firstNumber;
		int secondNumber;
		
		firstNumber = x ^ 2;
		secondNumber = y ^ 2;
		
		System.out.println("The number squared: " + firstNumber + ", " + secondNumber);
	}

}
