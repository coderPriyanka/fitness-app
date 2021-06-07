package practice;

import java.util.Scanner;

public class CalculateFraction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction[] fractions = new Fraction[3];
		fractions[0] = new Fraction(1, 2);
		fractions[1] = new Fraction(5, 7);
		fractions[2] = new Fraction(2, 10);
		System.out.println(calculateFraction(fractions));
		in.close();
	}

	public static Fraction calculateFraction(Fraction[] fractions) {
		long numerator = 1, denominator = 1;
		for (int i = 0; i < fractions.length; i++) {
			numerator = numerator * fractions[i].numerator;
			denominator = denominator * fractions[i].denominator;
		}
		long hcf;
		if (numerator > denominator) {
			hcf = findHcf(denominator, denominator);
		} else {
			hcf = findHcf(numerator, denominator);
		}
		numerator = numerator / hcf;
		denominator = denominator / hcf;
		Fraction fraction = new Fraction(numerator, denominator);
		return fraction;
	}

	private static long findHcf(long small, long large) {
		if (large % small == 0) {
			return small;
		}
		return findHcf(large % small, small);
	}

}

class Fraction {
	long numerator;
	long denominator;
	public Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public String toString() {
		return new String(numerator + " / " + denominator);
	}
}
