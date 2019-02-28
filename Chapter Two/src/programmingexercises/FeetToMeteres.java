package programmingexercises;

import java.util.Scanner;

public class FeetToMeteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a distance in feet to be converted to meteres");
		double Feet = sc.nextDouble();
		double Metere = Feet*0.305;
		System.out.println("That distance in meters is " + Metere);
	}

}
