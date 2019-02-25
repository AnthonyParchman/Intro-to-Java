package programmingexercises;

public class Censuscalaculations {

	public static void main(String[] args) {
		System.out.println("The us Census bearou perdics population using birth and deat statistics");
		System.out.println("They perdict a birth every 7 seconds");
		System.out.println("Thye perdict a death every 13 seconds");
		System.out.println("Dinaly they perdict an immigrant every 45 seconds");
		System.out.println("using this we can accurtately show the net change they perdic over the year by appling a negative value to deaths");
		System.out.println("and summing the output of all nu8mbers *60*60*24*365");
		System.out.println("Births sum to a yearly total of " + (60./7. *60. *24. * 365.));
		System.out.println("Deaths sum to a yearly total of " + (60./13. *60. *24. * 365.));
		System.out.println("immigrations sum to a yearly total of " + (60./45. *60. *24. * 365.));
		System.out.println("This means the yearly net population change is " + (4505142 + 700800 - 2425846) );
		
	}

}
