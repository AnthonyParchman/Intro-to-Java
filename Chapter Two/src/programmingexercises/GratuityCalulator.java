package programmingexercises;

import java.util.Scanner;

public class GratuityCalulator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input check total");
		double Check = sc.nextDouble();
		System.out.println("Please input desired gratutiy ");
		double Gratuity = sc.nextDouble();
		double Tip = Check * (Gratuity/100);
		double Total = Check + Tip;
		System.out.println("The tip for the evening is " + Tip + " This makes the total for the eveing " + Total);

}
}
