package programmingexercises;

import java.util.Scanner;

public class PoundsToKilos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a mass in pounds to be converted to kilograms");
		double Pound = sc.nextDouble();
		double Kilo = Pound/2.2;
		System.out.println( Pound +" That mass in kilograms is " + Kilo);

	}

}
