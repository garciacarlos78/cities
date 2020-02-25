package cities;

import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		
		// Empty vars
		String city1, city2, city3, city4, city5, city6;
		
		// Scanner for input reading
		Scanner scanner = new Scanner(System.in);
		
		// Ask for 6 cities to the user
		System.out.println("Introdueix el nom de 6 ciutats. Prem enter desprès de cada nom.");
		city1 = scanner.nextLine();
		city2 = scanner.nextLine();
		city3 = scanner.nextLine();
		city4 = scanner.nextLine();
		city5 = scanner.nextLine();
		city6 = scanner.nextLine();
		
		// Show the names in console
		System.out.println("Ciutats introduïdes: " + city1 + ", " + city2
				+ ", " + city3 + ", " + city4 + ", " + city5
				+ " i " + city6);
	}

}
