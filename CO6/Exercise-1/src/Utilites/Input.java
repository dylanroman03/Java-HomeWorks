package Utilites;

import java.util.Scanner;

public class Input {

	public static int checkInt(String type) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese " + type + ":\t");
		while (!scanner.hasNextInt()) {
			System.out.println("Dato Incorrecto\nIngrese " + type + ":\t");
			scanner.next();
		}

		return Integer.parseInt(scanner.next());
	}

	public static double checkDouble(String type) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese " + type + ":\t");

		while (!scanner.hasNextDouble()) {
			System.out.println("Dato Incorrecto\nIngrese " + type + ":\t");
			scanner.next();
		}

		return Double.parseDouble(scanner.next());
	}
	
}
