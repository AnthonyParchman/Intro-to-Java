package programmingexercises;

import java.util.Scanner;

public class VolumeOfCilinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.1415;
		System.out.println("Please input length");
		double Length = sc.nextDouble();
		System.out.println("Please input radius");
		double Radius = sc.nextDouble();
		
		double Area = Math.pow(Radius,Radius)*PI;
		System.out.println("Area is " + Area);
		
		Double Volume = Area*Length;
		System.out.println("Volume is " + Volume);
		
		
	}

}
