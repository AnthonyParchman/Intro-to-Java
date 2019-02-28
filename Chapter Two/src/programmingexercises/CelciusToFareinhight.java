package programmingexercises;

import java.util.Scanner;

public class CelciusToFareinhight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input temperature in degrees Fahrenheit for conversion to celsius");
		double Fahrenheit = sc.nextDouble();
		double Celsius = (Fahrenheit - 32)/1.8;
		System.out.println(Celsius);
		
	}

}
