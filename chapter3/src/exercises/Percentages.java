package exercises;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val1 = 2.0; 
		double val2 = 5.0;
		
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
