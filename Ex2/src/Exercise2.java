import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise2{
	
	
	static double result(int x, int y) {
		double rez = ((double) x) / y;
		return rez;
	}
	
	static double calculateSum(double x, double y) {
		double rez = x + y;
		return rez;
	}
	
	 	static BigDecimal calculateSubstraction(double x, double y) {
		BigDecimal res1 =(BigDecimal.valueOf(x)).subtract(BigDecimal.valueOf(y));
		return res1;
	}
	 	
	 	static BigDecimal calculateMultiplication(double x, double y) {
	 		BigDecimal res1 =(BigDecimal.valueOf(x)).multiply(BigDecimal.valueOf(y));
	 		return res1;
	 	}
	 	
	 	static BigDecimal calculateDivision(double x, double y) {
	 		BigDecimal res1 =(BigDecimal.valueOf(x)).divide(BigDecimal.valueOf(y),4, RoundingMode.CEILING);
	 		return res1;
	 	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator and denominator of the first fraction: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b == 0) {
			System.out.println("Enter another value for b");
			b = sc.nextInt();
		}
		
		System.out.println("Enter the numerator and denominator of the second fraction: ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(d == 0) {
			System.out.println("Enter another value for d");
			d = sc.nextInt();
		}
		
		double fraction1 = result(a, b);
		double fraction2 = result(c, d);
		System.out.println(fraction1 + " " + fraction2);
		
		double sumFraction = calculateSum(fraction1, fraction2);
		System.out.println("The sum of the fractions is: " + sumFraction);
		
		BigDecimal subFraction = calculateSubstraction(fraction1, fraction2);
		System.out.println("The substraction is: " + subFraction);
		
		BigDecimal multiFraction = calculateMultiplication(fraction1, fraction2);
		System.out.println("The multiplication is: " + multiFraction);
		
		BigDecimal multiDivision = calculateDivision(fraction1, fraction2);
		System.out.println("The division is: " + multiDivision);
		
		sc.close();
	}
}