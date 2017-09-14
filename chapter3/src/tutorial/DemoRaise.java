package tutorial;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary, startingWage;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your salary >> ");
		salary = input.nextDouble();
		System.out.print("Enter you starting wage >> ");
		startingWage = input.nextDouble();
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);
	}
	public static void predictRaise(double salary) {
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + "    After raise: " + newSalary);
	}

}
