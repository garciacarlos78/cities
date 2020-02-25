package cities;

import java.util.Arrays;
import java.util.Scanner;

public class Fase3 {

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
		
		/**
		 * Testing purposes. Comment above code and uncomment below code 
		 * to automatically get the cities.
		 */
		/*
		city1 = "Barcelona";
		city2 = "Madrid";
		city3 = "Valencia";
		city4 = "Malaga";
		city5 = "Cadis";
		city6 = "Santander";
		*/
		
		// Show the names in console
		System.out.println("Ciutats introduïdes: " + city1 + ", " + city2
				+ ", " + city3 + ", " + city4 + ", " + city5
				+ " i " + city6);
		
		// Create and initialize array
		String[] arrayCiutats = {city1, city2, city3, city4, city5, city6};
		
		// Sort array
		Arrays.sort(arrayCiutats);
		
		// Show the sorted array
		System.out.println("Ciutats ordenades: "+
				arrayCiutats[0] + ", " + arrayCiutats[1] + ", " + arrayCiutats[2] + ", " +
				arrayCiutats[3] + ", " + arrayCiutats[4] + " i " + arrayCiutats[5]);
		
		// Replace a for 4
		String [] arrayCiutatsModificades = new String[6];
		
		for (int i=0; i<arrayCiutats.length; i++) {
			arrayCiutatsModificades[i] = arrayCiutats[i].replace('a','4');
		}
		
		
		// Show ordered cities
		System.out.println("Ciutats ordenades amb 4s: "+
				arrayCiutatsModificades[0] + ", " + arrayCiutatsModificades[1] + ", " + arrayCiutatsModificades[2] + ", " +
				arrayCiutatsModificades[3] + ", " + arrayCiutatsModificades[4] + " i " + arrayCiutatsModificades[5]);
		
		/* Not necessary, the order is the same.
		// Sort after change a for 4
		Arrays.sort(arrayCiutatsModificades);
		
		// Show cities after new sorting
		System.out.println("Ciutats ordenades amb 4s: "+
				arrayCiutatsModificades[0] + ", " + arrayCiutatsModificades[1] + ", " + arrayCiutatsModificades[2] + ", " +
				arrayCiutatsModificades[3] + ", " + arrayCiutatsModificades[4] + " i " + arrayCiutatsModificades[5]);
		*/
	
	}

}
